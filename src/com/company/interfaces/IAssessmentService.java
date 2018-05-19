package com.company.interfaces;

public interface IAssessmentService {
    IAssessmentsFactory getAssessmentsFactory(IClass klass);
    void registerAssessment(IAssessment assessment, IClass klass);
    void printAssessments();
}
