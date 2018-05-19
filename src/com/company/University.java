package com.company;

import com.company.interfaces.*;

public class University extends AbsDepartment implements IUniversity{

    private static University _instance = null;
    private static IClassroomService _classroomService = new ClassroomService();
    private static IAssessmentService _assessmentService = new AssessmentService();

    public University(String title){
        this._title = title;
    }

    // University is singleton
    public static synchronized University getInstance(String title) {
        if (_instance == null){
            _instance = new University(title);
        }

        return _instance;
    }

    @Override
    public void addFaculty(IDepartment faculty) {
        _subDepartments.add(faculty);
    }

    @Override
    public void removeFaculty(IDepartment faculty) {
        _subDepartments.remove(faculty);
    }

    @Override
    public IClassroomService getClassroomservice() {
        return _classroomService;
    }

    @Override
    public IAssessmentService getAssessmentsService() {
        return _assessmentService;
    }


}
