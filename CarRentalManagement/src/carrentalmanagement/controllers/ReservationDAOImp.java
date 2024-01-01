/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalmanagement.controllers;

import carrentalmanagement.config.DbConnect;
import carrentalmanagement.models.Customer;
import carrentalmanagement.models.Reservation;
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
public class ReservationDAOImp implements ReservationDAO {

    Connection con = new DbConnect().getCon();
    List<Reservation> listRes;

    @Override
    public List<Reservation> getReservationsList() {
        try {
            listRes = new ArrayList<Reservation>();
            PreparedStatement ps = con.prepareStatement("select * from reservations");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reservation res = new Reservation(rs.getInt(1), rs.getInt(2), rs.getInt(3) ,rs.getString(4), rs.getString(5));
                listRes.add(res);
            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listRes;
    }

    @Override
    public Reservation getReservationById(Integer id) {
        Reservation res = null;
        try {
            PreparedStatement ps = con.prepareStatement("select * from reservations where id = ?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                res = new Reservation(
                        rs.getInt(1), rs.getInt(2), rs.getInt(3) ,rs.getString(4), rs.getString(5)
                );
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    public int addReservation(Reservation reserv) {
        int res = -1;
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO reservations(customer_id, car_id, start_date, end_date) values(?,?,?,?)");
            ps.setInt(1, reserv.getCustomer_id());
            ps.setInt(2, reserv.getCar_id());
            ps.setString(3, reserv.getReservation_begin_date());
            ps.setString(4, reserv.getReservation_end_date());

            res = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public int updateReservationById(Integer id, Reservation car) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deleteReservationById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
