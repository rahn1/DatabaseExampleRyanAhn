package org.overlake.mat803.databaseexample.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface SisDatabaseDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addStudent(Student student);

    @Update
    void updateStudent(Student student);

    @Query("SELECT COUNT(*) FROM Student")
    int studentCount();

    @Delete
    void deleteStudent(Student student);
}
