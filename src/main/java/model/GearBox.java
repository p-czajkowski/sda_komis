package model;

import javax.persistence.Column;
import java.io.Serializable;

public class GearBox extends BaseModel {

    @Column(name = "manualna")
    private String manual;
    @Column(name = "automatyczna")
    private String automat;
}
