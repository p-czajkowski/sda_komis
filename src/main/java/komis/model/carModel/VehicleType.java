package komis.model.carModel;

import komis.model.carModel.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_types")
public class VehicleType extends BaseModel {

    @Column(name = "name")
    private String name;
}
