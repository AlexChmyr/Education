package com.company;

import com.company.interfaces.ICathedra;

public class Cathedra extends Department implements ICathedra{
    public Cathedra(String title){
        _title = title;
    }
}
