package komis.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchases")
public class Purchase extends BaseModel {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicles_id")
    private Vehicle vehicle;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private Client clientId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private Integer sellPrice;
    private Integer PESEL;
    private Integer NIP;


    public Integer getPESEL() {
        return PESEL;
    }

    public void setPESEL(Integer PESEL) {
        this.PESEL = PESEL;
    }

    public Integer getNIP() {
        return NIP;
    }

    public void setNIP(Integer NIP) {
        this.NIP = NIP;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicleId) {
        this.vehicle = vehicleId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client userId) {
        this.clientId = userId;
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

    public void setSellPrice(Integer price) {
        this.sellPrice = price;
    }
}
