package carrentalmanagement.controllers;

import carrentalmanagement.config.DbConnect;
import carrentalmanagement.models.Car;
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
public class CarsDAOImp implements CarDAO {

    Connection con = new DbConnect().getCon();
    List<Car> listCars;

    @Override
    public List<Car> getCarsList() {

        try {
            listCars = new ArrayList<Car>();
            PreparedStatement ps = con.prepareStatement("select * from cars");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Car car = new Car(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getBoolean(5));
                listCars.add(car);

            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listCars;
    }

    @Override
    public Car getCarById(Integer id) {
        Car car = null;
        try {
            PreparedStatement ps = con.prepareStatement("select * from cars where id = ?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                car = new Car(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getBoolean(5));
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return car;

    }

    @Override
    public int addCar(Car car) {
        int res = -1;
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO cars(model, serial_number, price_per_hour, state) values(?,?,?,?)");
            ps.setString(1, car.getModel());
            ps.setString(2, car.getSeriel_number());
            ps.setDouble(3, car.getPrice_per_hour());
            ps.setBoolean(4, car.getState());
            res = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public int updateCarById(Integer id, Car car) {
        int res = -1;
        con = new DbConnect().getCon();
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE cars SET model=?,serial_number=?,price_per_hour=?,state=? WHERE id = ?");
            ps.setString(1, car.getModel());
            ps.setString(2, car.getSeriel_number());
            ps.setDouble(3, car.getPrice_per_hour());
            ps.setBoolean(4, car.getState());
            ps.setInt(5, id);
            res = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public int deleteCarById(Integer id) {
        int res = -1;
        con = new DbConnect().getCon();
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM cars WHERE id = ?");
            ps.setInt(1, id);
            res = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public List<Car> getCarsListByState() {
        try {
            listCars = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement("select * from cars where state = true");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Car car = new Car(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getBoolean(5));
                listCars.add(car);
            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listCars;
    }
}
