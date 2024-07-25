package com.perscholar.HealthCare_System;

import java.util.ArrayList;
import java.util.List;

public class Patient {
//make private
    int patientID ;
    String patientName ;
    List<MedicalRecord> medicalHistory;

    public Patient(int patientID, String patientName) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.medicalHistory = new ArrayList<>();
    }

    public int getPatientID() {
        return patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public List<MedicalRecord> getMedRecordList() {
        return medicalHistory;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setMedRecordList(List<MedicalRecord> medRecordList) {
        this.medicalHistory = medRecordList;
    }

    public void addMedicalRecord(MedicalRecord record){
        medicalHistory.add(record);
    }
    public void updateMedicalRecord(int index, MedicalRecord newRecord){
        medicalHistory.set(index,newRecord);
    }

    public MedicalRecord getMedicalRecord(int index){
        return medicalHistory.get(index);
    }

}

