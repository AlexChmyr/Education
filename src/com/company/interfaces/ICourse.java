package com.company.interfaces;

import com.company.AbsStudent;

import java.util.Date;

public interface ICourse {
    void setTitle(String title);
    String getTitle();
    void setDescription(String description);
    String getDescription();
    void subscribe(AbsStudent student);
    void unsubscribe(AbsStudent student);
    IClass appointClass(Date date);
    void notifyStudents();
}
