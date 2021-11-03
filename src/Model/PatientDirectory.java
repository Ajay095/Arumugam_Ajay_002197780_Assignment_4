/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ajay09
 */
public class PatientDirectory {
    final ArrayList <Patient> listOfPatients;
    
    public PatientDirectory() {
        listOfPatients =new ArrayList <Patient>();
    }

    public ArrayList<Patient> getListOfPatients() {
        return listOfPatients;
    }

    
    public Patient addNewPatient(){
        Patient patient = new Patient();
        listOfPatients.add(patient);
        return patient;
    }
    
    public Patient updatePatientList(int i, Patient patient) {
        listOfPatients.set(i, patient);
        return patient;
    }

    public void deletePatient(Patient patient) {
        listOfPatients.remove(patient);
    }
}
