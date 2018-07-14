package komis.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "manufacturers")
public class Manufacturer extends BaseModel {

    private String name;

//    @OneToMany(mappedBy = "carManufacturer")
//    private Set<CarModel> carModel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Set<CarModel> getCarModel() {
//        return carModel;
//    }
//
//    public void setCarModel(Set<CarModel> carModel) {
//        this.carModel = carModel;
//    }
}
