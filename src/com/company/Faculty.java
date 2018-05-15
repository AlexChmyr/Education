package com.company;

import com.company.interfaces.ICathedra;
import com.company.interfaces.IDepartment;
import com.company.interfaces.IFaculty;
import com.company.interfaces.IGroup;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Department implements IFaculty{

    private List<IGroup> _groups = new ArrayList<IGroup>();

    public Faculty(String title){
        _title = title;
    }

    @Override
    public void addCathedra(IDepartment cathedra) {
        _subDepartments.add(cathedra);
    }

    @Override
    public void removeCathedra(IDepartment cathedra) {
        _subDepartments.remove(cathedra);
    }

    @Override
    public void addGroup(IGroup group) {
        _groups.add(group);
    }

    @Override
    public void removeGroup(IGroup group) {
        _groups.remove(group);
    }
}
