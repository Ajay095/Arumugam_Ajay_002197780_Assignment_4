/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author ajay09
 */  

 public class Person extends House {
    String name;
    int age;
    String gender;
    
    
    public String getName() {
        return name;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    

    
    /*@Override
    public String toString() {
        return name;
    } */
}




