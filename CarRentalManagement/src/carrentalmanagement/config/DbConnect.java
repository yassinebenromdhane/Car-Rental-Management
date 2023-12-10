package carrentalmanagement.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author yassi
 */
public class DbConnect {
    Connection con;
    Statement state;
    
    public DbConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental","root","");
            System.out.println("DataBase Connected");             
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            
        }
        
    }
    public Connection getCon(){
        return con;
    }
    
}
