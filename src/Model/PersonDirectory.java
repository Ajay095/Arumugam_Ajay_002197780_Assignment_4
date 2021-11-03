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
public class PersonDirectory {
    ArrayList<Person> listOfPersons;

    public PersonDirectory() {
        listOfPersons = new ArrayList<Person>();
    }

    public ArrayList<Person> getListOfPersons() {
        return listOfPersons;
    }
    
    public Person createPerson(){
        Person person = new Person();
        listOfPersons.add(person);
        return person;
    }
    
}

    
   
        

