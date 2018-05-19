package com.company;

import com.company.enums.Gender;
import com.company.enums.Mark;
import com.company.interfaces.*;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        usecaseDepartments();
        //usecaseClassrooms();
        //usecaseClasses();
        //usecaseAssessments();
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

        System.out.println("First attempt:");
        crService.printFreeClassrooms();
        crService.printReservedClassrooms();

        crService.reserveClassroom("NM_3");
        crService.reserveClassroom("NM_4");

        System.out.println("\n\nSecond attempt:");
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

    private static void usecaseAssessments(){

        University univer = new University("KPI");
        IAssessmentService service = univer.getAssessmentsService();

        ICourse math = new Course("Mathematics");
        ICourse log = new Course("Logistics");
        IClass mathClass = math.appointClass(new GregorianCalendar(2018,05,25).getTime());
        IClass logClass = log.appointClass(new GregorianCalendar(2018,05,30).getTime());
        IAssessmentsFactory mathAssessmentsFactory = service.getAssessmentsFactory(mathClass);
        IAssessmentsFactory logAssessmentsFactory = service.getAssessmentsFactory(logClass);

        AbsStudent student1 = new Student("Victor", "Petrov", Gender.MALE);
        AbsStudent student2 = new Student("Kate", "Ivanova", Gender.FEMALE);
        AbsStudent student3 = new Student("Roman", "Durov", Gender.MALE);

        mathAssessmentsFactory.assess(student1, Mark.A);
        mathAssessmentsFactory.assess(student2, Mark.B);
        mathAssessmentsFactory.assess(student3, Mark.C);

        logAssessmentsFactory.assess(student1, Mark.B);
        logAssessmentsFactory.assess(student2, Mark.A);
        logAssessmentsFactory.assess(student3, Mark.A);

        service.printAssessments();
    }

}
