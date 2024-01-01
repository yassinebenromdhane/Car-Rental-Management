package carrentalmanagement.socket;

import carrentalmanagement.controllers.CarDAO;
import carrentalmanagement.controllers.CarsDAOImp;
import carrentalmanagement.controllers.CustomerDAO;
import carrentalmanagement.controllers.CustomerDAOImp;
import carrentalmanagement.forms.dialog.CustomerDialog;
import carrentalmanagement.models.Car;
import carrentalmanagement.models.Customer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ClientHandler extends Thread {

    private Socket socket;
    private List<Customer> customersList;
    private boolean isAddedCustomer;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

            while(true) {

                String action = in.readUTF();

                if("CREATE".equals(action)) {
                    Customer c = (Customer) in.readObject();
                    CustomerDAO dao = new CustomerDAOImp();
                    dao.addCustomer(c);
                    out.writeUTF("CREATED");
                    isAddedCustomer = true;
                }

                // autres actions CRUD

//                if("READ".equals(action)) {
//                    CustomerDAO dao = new CustomerDAOImp();
//                    customersList = new ArrayList<Customer>();
//                    customersList = dao.getCustomersList();
//                    out.writeObject(customersList);
//                }

            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean isAddedCustomer(){
        return this.isAddedCustomer;
    }
}