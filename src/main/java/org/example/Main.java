package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws PatientAgeExeptions , AllergyExeptions{
    Patient patient = new Patient(960110,"Abylaikhan",20);
    patient.addAllery("Cat");
    patient.addNote("Aqtobe 2025");

    Doctor doctor = new Doctor(001,"James Bond", Specialization.CARDIOLOGIST);
    Appointment appointment = new Appointment(001,patient,doctor);
    appointment.complete();

    Prescription prescription = new Prescription("Aspirine","2 in day","Week");
    patient.medicalRecord.addPrescription(prescription);



    }
}