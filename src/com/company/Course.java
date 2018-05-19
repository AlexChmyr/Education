package com.company;

import com.company.AbsStudent;
import com.company.Class;
import com.company.interfaces.IClass;
import com.company.interfaces.ICourse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course implements ICourse {
    private String _title;
    private String _description;
    private List<AbsStudent> _students = new ArrayList<AbsStudent>();
    private List<IClass> _classes = new ArrayList<IClass>();

    public Course(String title){
        _title = title;
    }

    @Override
    public void setTitle(String title) {
        _title = title;
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void subscribe(AbsStudent student) {
        _students.add(student);
    }

    @Override
    public void unsubscribe(AbsStudent student) {
        _students.remove(student);
    }

    @Override
    public IClass appointClass(Date date) {
        IClass newClass = new Class(this, date);
        _classes.add(newClass);
        return newClass;
    }

    @Override
    public void notifyStudents() {
        for (AbsStudent student: _students ) {
            for (IClass klass: _classes) {
                student.notify(klass);
            }
        }
    }
}
