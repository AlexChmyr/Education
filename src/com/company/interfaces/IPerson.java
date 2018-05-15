package com.company.interfaces;

import com.company.enums.Gender;

public interface IPerson {
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setGender(Gender gender);
    String getFirstName();
    String getLastName();
    String getFullName();
    Gender getGender();
}
