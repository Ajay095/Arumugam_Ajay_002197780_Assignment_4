/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ajay09
 */
public class Patient extends Person {
    
    String patientID;
    VitalSigns vitalSigns;
    Encounter encounter;
    EncounterHistory encounterHistory;

    public String getPatientID() {
        return patientID;
    }
    
     public void setPatientId(String patientID) {
        this.patientID = patientID;
    } 
    public Encounter newEncounter(){
        if (this.encounter != null){
            this.encounterHistory.getListOfEncounters().add(this.encounter);
        }
        this.encounter = new Encounter();
        return this.encounter;
    }
    
    public VitalSigns newVitals(Patient patient){
        if (this.vitalSigns != null){
            patient.getVitalSigns();
        }
        this.vitalSigns = new VitalSigns();
        return this.vitalSigns;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
    
    
}
