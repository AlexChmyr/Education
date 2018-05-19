package com.company.interfaces;

import com.company.AbsStudent;
import com.company.enums.Mark;

public interface IAssessmentsFactory {
    IAssessment assess(AbsStudent student, Mark mark);
}
