package com.company;

import com.company.enums.Gender;
import com.company.interfaces.*;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        //usecaseDepartments();
        //usecaseClassrooms();
        //usecaseClasses();
    }

    private static void usecaseDepartments(){

        University univer = new University("KPI");

        IFaculty itFaculty = new Faculty("Information technology");
        itFaculty.addCathedra(new Cathedra("Mathematics"));
        itFaculty.addCathedra(new Cathedra("Cybernetics"));
        univer.addFaculty(itFaculty);

        IFaculty mFaculty = new Faculty("Management");
        mFaculty.addCathedra(new Cathedra("Economics"));
        mFaculty.addCathedra(new Cathedra("Management"));
        mFaculty.addCathedra(new Cathedra("Marketing"));
        univer.addFaculty(mFaculty);

        univer.printSubDepartments(0);
    }

    private static void usecaseClassrooms(){

        University univer = new University("KPI");

        IClassroomService crService = univer.getClassroomservice();
        crService.printFreeClassrooms();
        crService.printReservedClassrooms();

        System.out.println("\n\n");

        crService.reserveClassroom("NM_3");
        crService.reserveClassroom("NM_4");
        crService.printFreeClassrooms();
        crService.printReservedClassrooms();
    }

    private static void usecaseClasses(){
        ICourse math = new Course("Mathematics");
        ICourse log = new Course("Logistics");
        AbsStudent student = new Student("Victor", "Petrov", Gender.MALE);

        math.subscribe(student);
        log.subscribe(student);

        math.appointClass(new GregorianCalendar(2018,05,25).getTime());
        math.appointClass(new GregorianCalendar(2018,06,02).getTime());
        log.appointClass(new GregorianCalendar(2018,05,20).getTime());
        log.appointClass(new GregorianCalendar(2018,06,02).getTime());
        log.appointClass(new GregorianCalendar(2018,06,11).getTime());

        math.notifyStudents();
        log.notifyStudents();
        student.PrintClasses();
    }

}
