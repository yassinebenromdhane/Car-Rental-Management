
package carrentalmanagement.controllers;

import carrentalmanagement.models.Reservation;
import java.util.List;

public interface ReservationDAO {
    List<Reservation> getReservationsList();
    Reservation getReservationById(Integer id);
    int addReservation(Reservation res);
    int updateReservationById(Integer id , Reservation res);
    int deleteReservationById(Integer id);
    
}
