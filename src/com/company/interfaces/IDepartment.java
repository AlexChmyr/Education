package com.company.interfaces;

import com.company.AbsTeacher;

import java.util.List;

public interface IDepartment {
    void addTeacher(AbsTeacher teacher);
    void removeTeacher(AbsTeacher teacher);
    void printSubDepartments(int level);
}
