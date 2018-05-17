package com.company;

import com.company.enums.Gender;
import com.company.interfaces.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Group implements IGroup, IHeadable{

    private String _title;
    private IPerson _head;
    private List<AbsStudent> students = new ArrayList<AbsStudent>();

    public Group(String title){
        _title = title;
    }

    @Override
    public void setHead(IPerson head) {
        _head = head;
    }

    @Override
    public void removeHead() {
        _head = null;
    }

    @Override
    public void addStudent(AbsStudent student){
            students.add(student);
    }

    @Override
    public void removeStudent(AbsStudent student) {
        students.remove(student);
    }
}
