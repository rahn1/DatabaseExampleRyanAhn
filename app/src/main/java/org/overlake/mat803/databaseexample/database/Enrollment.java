package org.overlake.mat803.databaseexample.database;

import androidx.room.Entity;

@Entity(primaryKeys = {"sisId","courseId"})
public class Enrollment {
    public int sisId;
    public int courseId;
}
