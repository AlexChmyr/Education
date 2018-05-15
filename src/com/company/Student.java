package com.company;

import com.company.enums.Gender;
import com.company.interfaces.IStudent;

public class Student extends Person implements IStudent {

    private int _yearOfStudy;

    public Student (String firstName, String lastName){
        super(firstName, lastName);
    }

    public Student (String firstName, String lastName, Gender gender){
        super(firstName, lastName, gender);
    }

    @Override
    public void setYearOfStudy(int year) {
        _yearOfStudy = year;
    }

    @Override
    public int getYearOfStudy() {
        return _yearOfStudy;
    }
}
