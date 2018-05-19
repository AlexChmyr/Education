package com.company;

import com.company.enums.Gender;
import com.company.interfaces.IObserver;
import com.company.interfaces.IStudent;
import com.company.interfaces.IClass;

import java.util.ArrayList;
import java.util.List;

public abstract class AbsStudent extends AbsPerson implements IStudent, IObserver {

    private int _yearOfStudy;
    private List<IClass> _classes= new ArrayList<IClass>();

    public AbsStudent (String firstName, String lastName){
        super(firstName, lastName);
    }

    public AbsStudent (String firstName, String lastName, Gender gender){
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

    @Override
    public void notify(Object o) {
        if (o instanceof IClass){
            _classes.add((IClass)o);
        }
    }

    @Override
    public void PrintClasses(){
        System.out.printf("%s %s classes:\n", _firstName, _lastName);
        for (IClass klass: _classes) {
            System.out.printf("\t %s\n", klass.getInfo());
        }
    }
}
