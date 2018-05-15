package com.company.interfaces;

import java.util.List;

public interface IDepartment {
    void addTeacher(IPerson teacher);
    void removeTeacher(IPerson teacher);
    void printSubDepartments(int level);
}
