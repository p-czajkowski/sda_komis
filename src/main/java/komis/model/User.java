package komis.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseModel{

    @Column(unique = true)
    private String login;
    private String password;
    @Transient
    private String confirmPassword;

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
