package com.company;

import com.company.enums.Mark;
import com.company.interfaces.IAssessment;
import com.company.interfaces.ICourse;

public class Assessment implements IAssessment {

    private AbsStudent _student;
    private Mark _mark;

    public Assessment(AbsStudent student, Mark mark){
        _student = student;
        _mark = mark;
    }

    @Override
    public String getRecord() {
        return _student.getFullName() + ": " + _mark.toString();
    }
}
