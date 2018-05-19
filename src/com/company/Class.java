package com.company;

import com.company.interfaces.IClass;
import com.company.interfaces.ICourse;

import java.util.Date;

public class Class implements IClass {
    private ICourse _course;
    private Date _date;

    public Class(ICourse course){
        _course = course;
    }

    public Class(ICourse course, Date date){
        _course = course;
        _date = date;
    }

    @Override
    public ICourse getCourse() {
        return _course;
    }

    @Override
    public String getInfo() {
        return _course.getTitle()+" appointed on "+_date.toString();
    }
}
