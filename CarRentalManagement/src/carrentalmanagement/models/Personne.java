/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalmanagement.models;


import java.io.Serializable;

public class Personne implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String lastName;

    public Personne(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Personne() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + '}';
    }
    
    
  

   
    

 
}
