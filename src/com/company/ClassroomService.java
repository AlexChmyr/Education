package com.company;

import com.company.interfaces.IClassroom;
import com.company.interfaces.IClassroomService;

import java.util.ArrayList;
import java.util.List;

public class ClassroomService implements IClassroomService {

    List<IClassroom> freeClassrooms  = new ArrayList<IClassroom>();
    List<IClassroom> reservedClassrooms  = new ArrayList<IClassroom>();

    public ClassroomService(){
        for(int i = 1; i <= 10; i++){
            String code = "NM_"+i;
            freeClassrooms.add(new Classroom(code, 40));
        }
    }

    @Override
    public IClassroom getClassroom(String code){
        for (IClassroom cr : freeClassrooms) {
            if (cr.getCode().equals(code)) {
                return cr;
            }
        }
        for (IClassroom cr : reservedClassrooms) {
            if (cr.getCode().equals(code)) {
                return cr;
            }
        }
        return null;
    }

    @Override
    public void reserveClassroom(String code) {
        IClassroom cr = getClassroom(code);
        synchronized (cr){
            if(freeClassrooms.contains(cr)){
                freeClassrooms.remove(cr);
                reservedClassrooms.add(cr);
            }
        }
    }

    @Override
    public void releaseClassroom(String code) {
        IClassroom cr = getClassroom(code);
        synchronized (cr){
            if(reservedClassrooms.contains(cr)){
                reservedClassrooms.remove(cr);
                freeClassrooms.add(cr);
            }
        }
    }

    @Override
    public void printFreeClassrooms() {
        System.out.println("Free classrooms:");
        for (IClassroom cr : freeClassrooms) {
            System.out.printf("\t%s \n", cr.getCode());
        }
    }

    @Override
    public void printReservedClassrooms() {
        System.out.println("Reserved classrooms:");
        for (IClassroom cr : reservedClassrooms) {
            System.out.printf("\t%s \n", cr.getCode());
        }
    }
}
