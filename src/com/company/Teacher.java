package com.company;

import com.company.enums.Gender;

public class Teacher extends AbsTeacher {
    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Teacher(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }
}
