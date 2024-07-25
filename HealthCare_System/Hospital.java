package com.perscholar.HealthCare_System;
//https://github.com/RaheemAbol/Healthcare_system
//https://github.com/RaheemAbol/Healthcare_system
public class Hospital <PatientRecord extends Patient>{

    PatientRecord patients ;

    public void addPatient(PatientRecord patient){
        this.patients = patient;
    }
    public PatientRecord getPatient(){
        return this.patients;
    }
}
