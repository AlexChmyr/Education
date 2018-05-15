package com.company;

import com.company.interfaces.IFaculty;
import com.company.interfaces.IUniversity;
import com.company.interfaces.IDepartment;
import com.company.interfaces.IClassroomService;

public class University extends Department implements IUniversity{

    private static University _instance = null;
    private static IClassroomService _classroomService = new ClassroomService();

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
}
