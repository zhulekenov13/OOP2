package org.example;

import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class Appointment {
    int id;
    Patient patient;
    Doctor doctor;
    LocalDateTime dateTime = LocalDateTime.now();
    AppointmentStatus appointmentStatus;

    public Appointment(int id, Patient patient, Doctor doctor){
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;

    }

    public void reschedule(){
        appointmentStatus = AppointmentStatus.SCHEDULED;
        System.out.println("Перенос");
    }
    public void cancel(){
        appointmentStatus = AppointmentStatus.CANCELLED;
        System.out.println("Отменён");
    }
    public void complete(){
        appointmentStatus =  AppointmentStatus.COMPLETED;
        System.out.println("Выполнен");
    }
}
