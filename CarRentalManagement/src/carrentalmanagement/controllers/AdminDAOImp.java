package carrentalmanagement.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import carrentalmanagement.config.DbConnect;
import carrentalmanagement.models.Admin;

public class AdminDAOImp implements AdminDAO {

    Connection con = new DbConnect().getCon();

    @Override
    public Admin login(String email, String password) {
        Admin a = new Admin();

        try {
            System.out.println("email is " + email);
            System.out.println("password is :" + password);
            PreparedStatement ps = con.prepareStatement("select * from admin where email = ? and password = ?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                a = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                System.out.println(a);
            }
        } catch (SQLException e) {
            //e.printStackTrace();
            e.getCause();
        }
        return a;
    }

    @Override
    public int addUser(String name, String last_name, String email, String password) {
        int res = -1;
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO admin(name, last_name, email, password) values(?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, last_name);
            ps.setString(3, email);
            ps.setString(4, password);
            res = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

}
