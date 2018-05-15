package com.company.interfaces;

public interface IClassroomService {
    IClassroom getClassroom(String code);
    void reserveClassroom(String code);
    void releaseClassroom(String code);
    void printFreeClassrooms();
    void printReservedClassrooms();

}
