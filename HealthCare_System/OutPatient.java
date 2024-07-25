package com.perscholar.HealthCare_System;

public class OutPatient extends Patient {

    String appointmentDate;
    String doctorName;
    public OutPatient(int patientID, String patientName,String appointmentDate, String doctorName){
        super(patientID,patientName);
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString(){
       return "for Patient name "+ getPatientName()+"with Patient ID "+getPatientID()+" appointment date "+getAppointmentDate()+" doctor name "+getDoctorName();
    }
}
