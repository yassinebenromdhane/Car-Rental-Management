
package carrentalmanagement.controllers;

import carrentalmanagement.models.Customer;
import java.util.List;


public interface CustomerDAO {
    
    List<Customer> getCustomersList();
    Customer getCustomerById(Integer id);
    int addCustomer(Customer customer);
    int updateCustomerById(Integer id , Customer customer);
    int deleteCustomerById(Integer id);
    
}
