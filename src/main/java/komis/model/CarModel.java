package komis.model;

import javax.persistence.*;

@Entity
@Table(name = "vehicle_models")
public class CarModel extends BaseModel {

    @Column(name = "model")
    private String model;
    @ManyToOne
    @JoinColumn(name = "carManufacturerId")
    private Manufacturer manufacturer;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
