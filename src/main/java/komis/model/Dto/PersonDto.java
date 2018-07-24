package komis.model.Dto;

import komis.model.User;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class PersonDto {
    @NotNull(message = "Imię jest wymagane")
    @Length(min = 3, message = "Imię musi mieć przynajmniej trzy znaki")
    private String name;
    @NotNull(message = "Nazwisko jest wymagane")
    @Length(min = 3, message = "Nazwisko musi mieć co najmniej 3 znaki")
    private String lastName;
    @NotNull(message = "adres jest wymagany")
    @Length(min = 5, message = "Adres musi mieć przynajmniej 5 znaków")
    private String adress;
    private Integer pesel;
    private Integer nip;
    private User userId;

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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }

    public Integer getNip() {
        return nip;
    }

    public void setNip(Integer nip) {
        this.nip = nip;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
