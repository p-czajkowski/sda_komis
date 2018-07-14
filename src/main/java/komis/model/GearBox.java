package komis.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class GearBox extends BaseModel {

    @Column(name = "name")
    private String name;
}
