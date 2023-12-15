/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalmanagement.models;

/**
 *
 * @author mre
 */
public class Car {
    int id;
    String model;
    String seriel_number;
    double price_per_hour;
    boolean state;

    public Car() {
    }

    public Car(int id, String model, String seriel_number, double price_per_hour, boolean state) {
        this.id = id;
        this.model = model;
        this.seriel_number = seriel_number;
        this.price_per_hour = price_per_hour;
        this.state = state;
    }

    public Car(String model, String seriel_number, double price_per_hour, boolean state) {
        this.model = model;
        this.seriel_number = seriel_number;
        this.price_per_hour = price_per_hour;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeriel_number() {
        return seriel_number;
    }

    public void setSeriel_number(String seriel_number) {
        this.seriel_number = seriel_number;
    }

    public double getPrice_per_hour() {
        return price_per_hour;
    }

    public void setPrice_per_hour(double price_per_hour) {
        this.price_per_hour = price_per_hour;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", model=" + model + ", seriel_number=" + seriel_number + ", price_per_hour=" + price_per_hour + ", state=" + state + '}';
    }
    
    
    
}
