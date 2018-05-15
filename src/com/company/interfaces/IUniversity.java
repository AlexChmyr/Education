package com.company.interfaces;

public interface IUniversity {
    void addFaculty(IDepartment faculty);
    void removeFaculty(IDepartment faculty);
    IClassroomService getClassroomservice();
}
