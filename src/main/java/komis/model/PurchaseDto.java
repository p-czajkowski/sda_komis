package komis.model;

import java.util.Date;

public class PurchaseDto {

        private Integer vehicleId;
        private Integer clientId;
        private Date date;
        private Integer price;
        private Integer PESEL;
        private Integer NIP;

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
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
}
