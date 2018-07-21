package komis.model.Dto;

import java.util.Date;

public class PurchaseDto {


    private Integer vehicleId;
    private Integer clientId;
    private Date date;
    private Integer price;
    private Integer PESEL;
    private Integer NIP;
    private String name;
    private String lastName;
    private String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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
