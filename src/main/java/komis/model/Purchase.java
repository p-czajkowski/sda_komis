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
    @JoinColumn(name = "clients_id")
    private Client clientId;

    @DateTimeFormat
    private Date date;

}
