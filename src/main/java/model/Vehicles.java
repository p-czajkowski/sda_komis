package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Vehicles extends BaseModel {

    @Column(name = "numer_nadwozia")
    private String body_nr;

    @Column(name = "rok_produkcji")
    private Integer productionYear;

    @Column(name = "marka")
    private String manufacturer;

    @Column(name = "model")
    private String model;

    @Column(name = "numer_ubezpieczenia")
    private String insuranceNumber;

    @Column(name = "numer_dowodu_rejestracyjnego")
    private String plateNumber;

    @Column(name = "typ_paliwa")
    @OneToMany
    @JoinColumn("fuel_id")
    private Fuel fuel;

    @Column(name = "przebieg")
    private Integer mileage;

    @Column(name = "silnik")
    private String engine;

    @Column(name = "moc")
    private Integer power;

    @Column(name = "skrzynia_biegów")
    @OneToMany
    @JoinColumn("gear_box_id")
    private GearBox gearbox;

    @Column(name = "opis")
    private String description;

    @Column(name = "ilość_jazd_próbnych")
    private Integer testDrives;
}
