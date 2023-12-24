
package carrentalmanagement.controllers;

import carrentalmanagement.models.Car;
import java.util.List;

public interface CarDAO {
    
    List<Car> getCarsList();
    List<Car> getCarsListByState();
    Car getCarById(Integer id);
    int addCar(Car car);
    int updateCarById(Integer id , Car car);
    int deleteCarById(Integer id);
    
}
