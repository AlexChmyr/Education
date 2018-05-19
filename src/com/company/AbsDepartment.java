package com.company;

import com.company.interfaces.*;
import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class AbsDepartment implements IDepartment, IHeadable{

    protected String _title;
    protected List<IDepartment> _subDepartments = new ArrayList<IDepartment>();
    protected List<AbsTeacher> staff  = new ArrayList<AbsTeacher>();
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

    public void addTeacher(AbsTeacher teacher){
        staff.add(teacher);
    };

    public void removeTeacher(AbsTeacher teacher){
        staff.remove(teacher);
    };
}
