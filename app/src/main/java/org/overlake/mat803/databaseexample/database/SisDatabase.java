package org.overlake.mat803.databaseexample.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Student.class, Course.class, Enrollment.class}, version = 1)
public abstract class SisDatabase extends RoomDatabase {
    public abstract SisDatabaseDao getDao();
}
