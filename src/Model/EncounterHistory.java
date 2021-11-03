/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author bunty
 */
public class EncounterHistory {
    ArrayList<Encounter> listOfEncounters;
    public EncounterHistory() {
        listOfEncounters = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getListOfEncounters() {
        return listOfEncounters;
    }

    public void setEncounterList(ArrayList<Encounter> listOfEncounters) {
        this.listOfEncounters = listOfEncounters;
        
    }
    /*public Encounter addEncounterToList(){
        Encounter newEncounter = new Encounter();
        listOfEncounters.add(newEncounter);
        return newEncounter;
    }*/
    
}
