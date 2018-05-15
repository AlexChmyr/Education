package com.company;

import com.company.interfaces.*;
import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class Department implements IDepartment, IHeadable{

    protected String _title;
    protected List<IDepartment> _subDepartments = new ArrayList<IDepartment>();
    protected List<IPerson> staff  = new ArrayList<IPerson>();
    protected IPerson _head;

    public void printSubDepartments(int level){
        String gap = new String(new char[level]).replace("\0", "\t");
        System.out.printf("%s %s\n", gap, _title);
        level++;
        for (IDepartment subdep : _subDepartments) {
            subdep.printSubDepartments(level);
        }
    }

    public void setHead(IPerson head){
        _head = head;
    };

    public void removeHead(){
        _head = null;
    };

    public void addTeacher(IPerson teacher){
        if (teacher instanceof ITeacher){
            staff.add(teacher);
        }
    };

    public void removeTeacher(IPerson teacher){
        staff.remove(teacher);
    };
}
