package org.overlake.mat803.databaseexample.database;

import androidx.room.Entity;

@Entity
public class Student extends User {
    public Student(int sisId, String firstName, String lastName) {
        super(sisId, firstName, lastName);
    }
}
