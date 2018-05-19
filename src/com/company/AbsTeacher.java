package com.company;

import com.company.enums.Gender;
import com.company.interfaces.ITeacher;

public abstract class AbsTeacher extends AbsPerson implements ITeacher {

    private String _position;

    public AbsTeacher (String firstName, String lastName){
        super(firstName, lastName);
    }

    public AbsTeacher (String firstName, String lastName, Gender gender){
        super(firstName, lastName, gender);
    }

    @Override
    public void setPosition(String position) {
        _position = position;
    }

    @Override
    public String getPosition() {
        return _position;
    }
}
