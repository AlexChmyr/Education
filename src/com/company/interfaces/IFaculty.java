package com.company.interfaces;

public interface IFaculty extends IDepartment {
    void addCathedra (IDepartment cathedra);
    void removeCathedra (IDepartment cathedra);
    void addGroup (IGroup group);
    void removeGroup (IGroup group);
}
