package org.example;

public class Doctor {
    int id;
    String name;
    Specialization specialization;

    public Doctor(int id, String name, Specialization specialization){
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }
}
