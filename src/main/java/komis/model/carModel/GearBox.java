package komis.model.carModel;

import komis.model.carModel.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class GearBox extends BaseModel {

    @Column(name = "name")
    private String name;
}
