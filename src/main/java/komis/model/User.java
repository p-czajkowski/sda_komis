package komis.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User extends BaseModel{

    @Column(unique = true)
    private String login;
    private String password;
    @Transient
    private String confirmPassword;

    private Integer pesel;
    private String agress;

    private Date employeDate;

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }

    public String getAgress() {
        return agress;
    }

    public void setAgress(String agress) {
        this.agress = agress;
    }

    public Date getEmployeDate() {
        return employeDate;
    }

    public void setEmployeDate(Date employeDate) {
        this.employeDate = employeDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
