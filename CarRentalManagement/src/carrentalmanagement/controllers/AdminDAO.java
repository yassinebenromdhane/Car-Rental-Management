package carrentalmanagement.controllers;

import carrentalmanagement.models.Admin;



public interface AdminDAO {
    Admin login(String email,String password);
    int addUser(String name , String last_name , String email , String password );
    
}
