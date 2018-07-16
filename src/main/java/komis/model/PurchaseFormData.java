package komis.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PurchaseFormData {

    @NotNull
    @Min(1)
    private Long vehicleId;
    @NotNull
    @Min(500)
    private Long price;
    @NotNull
    @Size(min=1, max=200)
    private String name;
    @NotNull
    @Size(min=1, max=200)
    private String surname;
    @NotNull
    @Size(min=1, max=200)
    private String documentNo;
    @NotNull
    @Size(min=1, max=50)
    private String telephone;


    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
