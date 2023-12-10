package carrentalmanagement.controllers;

import carrentalmanagement.models.Admin;



public interface AdminDAO {
    Admin login(String email,String password);
    
}
