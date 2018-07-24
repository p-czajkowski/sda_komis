package komis.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchases")
public class Purchase extends BaseModel {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicles_id")
    private Vehicle vehicleId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Person personId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private Integer sellPrice;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "name")
//    private Person name;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "lastName")
//    private Person lastName;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "adress")
//    private Person adress;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "pesel")
//    private Person pesel;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "nip")
//    private Person nip;

    public Vehicle getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Vehicle vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

//    public Person getName() {
//        return name;
//    }
//
//    public void setName(Person name) {
//        this.name = name;
//    }
//
//    public Person getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(Person lastName) {
//        this.lastName = lastName;
//    }
//
//    public Person getAdress() {
//        return adress;
//    }
//
//    public void setAdress(Person adress) {
//        this.adress = adress;
//    }
//
//    public Person getPesel() {
//        return pesel;
//    }
//
//    public void setPesel(Person pesel) {
//        this.pesel = pesel;
//    }
//
//    public Person getNip() {
//        return nip;
//    }
//
//    public void setNip(Person nip) {
//        this.nip = nip;
//    }
}
