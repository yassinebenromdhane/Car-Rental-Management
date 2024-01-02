package carrentalmanagement.socket;

import carrentalmanagement.controllers.CarDAO;
import carrentalmanagement.controllers.CarsDAOImp;
import carrentalmanagement.controllers.CustomerDAO;
import carrentalmanagement.controllers.CustomerDAOImp;
import carrentalmanagement.forms.dialog.CustomerDialog;
import carrentalmanagement.models.Car;
import carrentalmanagement.models.Customer;
import com.google.gson.Gson;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ClientHandler extends Thread {

    private Socket socket;
    private List<Customer> customersList;
    private boolean isAddedCustomer;
    private BufferedReader in;
    private PrintWriter out;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {

            while(true) {

                String action = in.readLine();

                if("CREATE".equals(action)) {
                    System.out.println("CREATE ....");
                    String s = in.readLine();
                    Gson gson = new Gson();
                    Customer c = gson.fromJson(s , Customer.class);
                    System.out.println(c);
                    CustomerDAO dao = new CustomerDAOImp();
                    dao.addCustomer(c);
                    out.println("CREATED");
                    System.out.println("CREATED ....");
                }

                // autres actions CRUD

//                if("READ".equals(action)) {
//                    CustomerDAO dao = new CustomerDAOImp();
//                    customersList = new ArrayList<Customer>();
//                    customersList = dao.getCustomersList();
//                    out.writeObject(customersList);
//                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}