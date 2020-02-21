package com.example.simon;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface StudentDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertStudent(Student student);

    @Query("DELETE FROM student_table")
    void deleteAllStudent();

    @Query("SELECT * from student_table ORDER BY mId ASC")
    List<Student> getAllStudent();

    @Update(entity = Student.class)
    void updateStudent(Student student);

    @Delete(entity = Student.class)
    void deleteStudent(Student student);
}
