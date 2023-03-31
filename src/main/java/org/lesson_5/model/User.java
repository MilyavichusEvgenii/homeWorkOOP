package org.lesson_5.model;

import java.util.Objects;

public abstract class User {
    int id_group;
    String firstName;
    String secondName;


    public User(int id_group, String firstName, String secondName) {
        this.id_group = id_group;
        this.firstName = firstName;
        this.secondName = secondName;
    }
    @Override
    public abstract String toString();

    public abstract int getId_group();

}
