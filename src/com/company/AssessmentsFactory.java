package com.company;

import com.company.enums.Mark;
import com.company.interfaces.IAssessment;
import com.company.interfaces.IAssessmentService;
import com.company.interfaces.IAssessmentsFactory;
import com.company.interfaces.IClass;

public class AssessmentsFactory implements IAssessmentsFactory {

    private IClass _class;
    private IAssessmentService _service;

    public AssessmentsFactory(IClass klass, IAssessmentService service){
        _class = klass;
        _service = service;
    }

    @Override
    public IAssessment assess(AbsStudent student, Mark mark) {
        IAssessment newAssessment = new Assessment(student,mark);
        _service.registerAssessment(newAssessment, _class);
        return newAssessment;
    }
}
