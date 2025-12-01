package org.example;

import javax.xml.namespace.QName;

public class Patient {
    int id;
    String name;
    int age;
    MedicalRecord medicalRecord = new MedicalRecord();
    public Patient(int id, String name, int age) throws PatientAgeExeptions{
        if (age<16) throw new PatientAgeExeptions("Age < 16");
        this.id =id;
        this.name = name;
        this.age = age;

    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }


    public void addAllery(String allergy) throws AllergyExeptions{
        if(medicalRecord.allergies.contains(allergy)) throw new AllergyExeptions("Dublicat");
        medicalRecord.addAllergy(allergy);
    }

    public void addNote(String note){
        medicalRecord.addNote(note);
    }

}
