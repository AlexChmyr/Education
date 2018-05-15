package com.company;

import com.company.interfaces.*;
import com.company.interfaces.IUniversity;

public class Main {

    public static void main(String[] args) {
        //usecaseDepartments();
        //usecaseClassrooms();
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

}
