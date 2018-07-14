package model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CarManufacturer extends BaseModel {

    @Column
    private String manufacturer;
}
