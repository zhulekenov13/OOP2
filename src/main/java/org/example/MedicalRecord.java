package org.example;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecord {
    List<String> allergies = new ArrayList<>();
    List<String> notes = new ArrayList<>();
    List<Prescription> prescriptions = new ArrayList<>();

    public List<String> getAllergies() {
        return allergies;
    }

    public List<String> getNotes() {
        return notes;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void addAllergy(String allergy){
        allergies.add(allergy);
    }
    public void addNote(String note){
        notes.add(note);
    }
    public void addPrescription(Prescription prescription){

        prescriptions.add(prescription);
    }
}
