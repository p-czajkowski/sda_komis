package komis.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchases")
public class Purchase extends BaseModel {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicles_id")
    private Vehicle vehicleId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private User userId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column
    private Integer price;

    public Vehicle getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Vehicle vehicleId) {
        this.vehicleId = vehicleId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
