package komis.model;

import javax.persistence.*;

@Entity
@Table(name = "vehicle_models")
public class CarModel extends BaseModel {

    @Column(name = "model")
    private String name;
    @ManyToOne
    @JoinColumn(name = "carManufacturerId")
    private Manufacturer manufacturer;

    public String getName() {
        return name;
    }

    public void setName(String model) {
        this.name = model;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
