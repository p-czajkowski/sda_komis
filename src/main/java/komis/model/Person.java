package komis.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person extends BaseModel{

    @JoinColumn(name = "userId")
    @OneToOne
    private User userId;
    private String name;
    private String lastName;
    private String adress;
    private Integer pesel;
    private Integer nip;

    public User getUserid() {
        return userId;
    }

    public void setUserid(User userId) {
        this.userId = userId;
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
}
