package com.company;

import com.company.interfaces.IClassroom;

public class Classroom implements IClassroom {
    private String _code;
    private int _capacity;

    public Classroom(String code, int capacity){
        _code = code;
        _capacity = capacity;
    }

    @Override
    public void setCode(String code) {
        _code = code;
    }

    @Override
    public String getCode() {
        return _code;
    }

    @Override
    public void setCapacity(int capacity) {
        _capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return _capacity;
    }
}
