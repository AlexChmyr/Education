package com.company;

import com.company.enums.Gender;
import com.company.interfaces.IPerson;

public abstract class AbsPerson implements IPerson {
    protected String _firstName;
    protected String _lastName;
    protected Gender _gender;

    public AbsPerson(String firstName, String lastName){
        _firstName = firstName;
        _lastName = lastName;
    }

    public AbsPerson(String firstName, String lastName, Gender gender){
        this(firstName,lastName);
        _gender = gender;
    }

    @Override
    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    @Override
    public void setGender(Gender gender) {
        _gender = gender;
    }

    @Override
    public String getFirstName() {
        return _firstName;
    }

    @Override
    public String getLastName() {
        return _lastName;
    }

    @Override
    public String getFullName() {
        return _firstName + " " + _lastName;
    }

    @Override
    public Gender getGender() {
        return _gender;
    }
}
