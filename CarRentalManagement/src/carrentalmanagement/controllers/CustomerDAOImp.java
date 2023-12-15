/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalmanagement.controllers;

import carrentalmanagement.config.DbConnect;
import carrentalmanagement.models.Car;
import carrentalmanagement.models.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mre
 */
public class CustomerDAOImp implements CustomerDAO {

    Connection con = new DbConnect().getCon();
    List<Customer> listCustomers;

    @Override
    public List<Customer> getCustomersList() {
        try {
            listCustomers = new ArrayList<Customer>();
            PreparedStatement ps = con.prepareStatement("select * from customers");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                listCustomers.add(customer);

            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listCustomers;
    }

    @Override
    public Customer getCustomerById(Integer id) {
        Customer customer = null;
        try {
            PreparedStatement ps = con.prepareStatement("select * from customers where id = ?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                customer = new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)
                );
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customer;
    }

    @Override
    public int addCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int updateCustomerById(Integer id, Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deleteCustomerById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
