/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalmanagement.table.models;

import carrentalmanagement.models.Customer;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mre
 */
public class CustomerTableModel extends AbstractTableModel{
    
      private List<Customer> customers;

    public CustomerTableModel(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public int getRowCount() {
        return customers.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Name";
            case 2:
                return "Last Name";
            case 3:
                return "Age";
            default:
                return "Unknown";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Customer customer = customers.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return customer.getId();
            case 1:
                return customer.getName();
            case 2:
                return customer.getLastName();
            case 3:
                return customer.getAge();
        }
        return null;
    }

    
}
