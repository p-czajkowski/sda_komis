package model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class VehicleType extends BaseModel {

    @Column(name = "do_3,5t")
    private String car;
    @Column(name = "powyżej_3,5t")
    private String truck;
    @Column(name = "hatchback")
    private String hatchback;
    @Column(name = "kombi")
    private String estate;
    @Column(name = "kabriolet")
    private String cabrio;
    @Column(name = "sedan")
    private String sedan;
    @Column(name = "limuzyna")
    private String limo;

}
