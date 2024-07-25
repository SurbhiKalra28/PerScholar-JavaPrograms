package com.perscholar.HealthCare_System;

import java.util.List;

public class InPatient <T extends Patient> extends Patient {

    String admissionDate;
    String roomNumber;

    public InPatient(int patientID, String patientName, String admissionDate, String roomNumber) {
        super(patientID, patientName);
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
    }



    public String getAdmissionDate() {
        return admissionDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return " for PatientName "+getPatientName()+" with Patient Id"+getPatientID()+" admission Date is "+
                getAdmissionDate()+" and Room Number is "+getRoomNumber();
    }
}
