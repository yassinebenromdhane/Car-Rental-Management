/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalmanagement.table.models;

import carrentalmanagement.models.Customer;
import carrentalmanagement.models.Reservation;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mre
 */
public class ReservationTableModel extends AbstractTableModel{
    
    
     private List<Reservation> res;

    public ReservationTableModel(List<Reservation> res) {
        this.res = res;
    }

    @Override
    public int getRowCount() {
        return res.size();
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
                return "Customer id";
            case 2:
                return "Car id";
            case 3:
                return "Begin date";
            case 4:
                return "End date";
            default:
                return "Unknown";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reservation reservation = res.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return reservation.getId();
            case 1:
                return reservation.getCustomer_id();
            case 2:
                return reservation.getCar_id();
            case 3:
                return reservation.getReservation_begin_date();
            case 4:
                return reservation.getReservation_end_date();
        }
        return null;
    }

    
}
