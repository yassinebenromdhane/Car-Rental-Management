package carrentalmanagement.models;


public class Reservation {
    int id;
    int customer_id;
    int car_id;
    String reservation_begin_date;
    String reservation_end_date;
    double hours;
    double total;

    public Reservation() {
    }

    public Reservation(int id, int customer_id, int car_id, String reservation_begin_date, String reservation_end_date, double hours, double total) {
        this.id = id;
        this.customer_id = customer_id;
        this.car_id = car_id;
        this.reservation_begin_date = reservation_begin_date;
        this.reservation_end_date = reservation_end_date;
        this.hours = hours;
        this.total = total;
    }

    public Reservation(int customer_id, int car_id, String reservation_begin_date, String reservation_end_date, double hours, double total) {
        this.customer_id = customer_id;
        this.car_id = car_id;
        this.reservation_begin_date = reservation_begin_date;
        this.reservation_end_date = reservation_end_date;
        this.hours = hours;
        this.total = total;
    }
    
    public Reservation(int id ,int customer_id, int car_id, String reservation_begin_date, String reservation_end_date) {
        this.id = id;
        this.customer_id = customer_id;
        this.car_id = car_id;
        this.reservation_begin_date = reservation_begin_date;
        this.reservation_end_date = reservation_end_date;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getReservation_begin_date() {
        return reservation_begin_date;
    }

    public void setReservation_begin_date(String reservation_begin_date) {
        this.reservation_begin_date = reservation_begin_date;
    }

    public String getReservation_end_date() {
        return reservation_end_date;
    }

    public void setReservation_end_date(String reservation_end_date) {
        this.reservation_end_date = reservation_end_date;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", customer_id=" + customer_id + ", car_id=" + car_id + ", reservation_begin_date=" + reservation_begin_date + ", reservation_end_date=" + reservation_end_date + ", hours=" + hours + ", total=" + total + '}';
    }
    
}
