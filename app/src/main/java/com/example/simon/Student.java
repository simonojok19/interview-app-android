package com.example.simon;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student_table")
public class Student {
    @PrimaryKey(autoGenerate = true)
    private int mId;


    @ColumnInfo(name="name")
    private String mName;

    @ColumnInfo(name = "class")
    private String mClass;

    @ColumnInfo(name = "school")
    private String mSchool;

    @ColumnInfo(name = "district")
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

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }
}
