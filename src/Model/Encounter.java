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
public class Encounter extends Patient {
    
    String encounterDate;
    VitalSigns vitalSigns;
    
    public Encounter() {
        this.vitalSigns = new VitalSigns();
     
    }
    
    public String getEncounterDate() { 
        return encounterDate;
    }

    public void setEncounterDate(String encounterDate) {
        this.encounterDate = encounterDate;
    }
    
}