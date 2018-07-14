package komis.model;

import komis.model.carModel.CarManufacturer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "car_models")
public class CarModel extends BaseModel {

    @Column
    private String model;

    @JoinColumn(name = "manufacturer_id")
    private CarManufacturer carManufacturer;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarManufacturer getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(CarManufacturer carManufacturer) {
        this.carManufacturer = carManufacturer;
    }
}
