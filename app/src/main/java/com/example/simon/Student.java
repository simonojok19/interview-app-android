package com.example.simon;

import androidx.annotation.NonNull;

public class Student {
    private String mName;
    private String mClass;
    private String mSchool;
    private String mDistrict;

    public Student(@NonNull  String mName, String mClass, String mSchool, String mDistrict) {
        this.mName = mName;
        this.mClass = mClass;
        this.mSchool = mSchool;
        this.mDistrict = mDistrict;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmClass(String mClass) {
        this.mClass = mClass;
    }

    public void setmSchool(String mSchool) {
        this.mSchool = mSchool;
    }

    public void setmDistrict(String mDistrict) {
        this.mDistrict = mDistrict;
    }

    public String getmName() {
        return mName;
    }

    public String getmClass() {
        return mClass;
    }

    public String getmSchool() {
        return mSchool;
    }

    public String getmDistrict() {
        return mDistrict;
    }
}
