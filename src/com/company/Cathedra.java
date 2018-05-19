package com.company;

import com.company.interfaces.ICathedra;

public class Cathedra extends AbsDepartment implements ICathedra{
    public Cathedra(String title){
        _title = title;
    }
}
