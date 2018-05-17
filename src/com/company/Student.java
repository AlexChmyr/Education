package com.company;

import com.company.enums.Gender;

public class Student extends AbsStudent {
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Student(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }
}
