package com.company;

import com.company.interfaces.*;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class AssessmentService implements IAssessmentService {

    private Map<ICourse,
                Map<IClass,
                    List<IAssessment>>> _assessments = new HashMap<ICourse, Map<IClass, List<IAssessment>>>();

    @Override
    public IAssessmentsFactory getAssessmentsFactory(IClass klass) {
        return new AssessmentsFactory(klass, this);
    }

    @Override
    public void registerAssessment(IAssessment assessment, IClass klass) {
        ICourse course = klass.getCourse();
        if(!_assessments.containsKey(course)){
            _assessments.put(course,new HashMap<IClass, List<IAssessment>>());
        }

        if(!_assessments.get(course).containsKey(klass)){
            _assessments.get(course).put(klass, new ArrayList<IAssessment>());
        }

        _assessments.get(course).get(klass).add(assessment);
    }

    @Override
    public void printAssessments() {
        for(Map.Entry<ICourse, Map<IClass, List<IAssessment>>> course : _assessments.entrySet()) {
            ICourse key = course.getKey();
            Map<IClass,List<IAssessment>> value = course.getValue();

            System.out.printf("Course: %s\n", key.getTitle());
            for(Map.Entry<IClass,List<IAssessment>> klass : value.entrySet()) {
                IClass key1 = klass.getKey();
                List<IAssessment> value1 = klass.getValue();

                System.out.printf("\tClass: %s\n", key1.getInfo());
                for (IAssessment mark : value1) {
                    System.out.printf("\t\t %s\n", mark.getRecord());
                }
            }
        }
    }


}
