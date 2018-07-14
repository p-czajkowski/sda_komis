package model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CarModel extends BaseModel {

    @Column
    private String model;
}
