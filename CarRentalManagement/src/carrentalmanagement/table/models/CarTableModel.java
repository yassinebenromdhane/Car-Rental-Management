
package carrentalmanagement.table.models;

import carrentalmanagement.models.Car;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CarTableModel extends AbstractTableModel {

    private List<Car> cars;

    public CarTableModel(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public int getRowCount() {
        return cars.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Model";
            case 2:
                return "Serial Number";
            case 3:
                return "Price per hour";
            case 4:
                return "State";
            default:
                return "Unknown";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Car car = cars.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return car.getId();
            case 1:
                return car.getModel();
            case 2:
                return car.getSeriel_number();
            case 3:
                return car.getPrice_per_hour();
            case 4:
                return car.getState();
        }
        return null;
    }

}
