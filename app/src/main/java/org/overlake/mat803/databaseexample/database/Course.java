package org.overlake.mat803.databaseexample.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Course {
    @PrimaryKey
    public int courseID;
    public String courseName;
}
