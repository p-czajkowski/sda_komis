package komis.model;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.Table;

@Eager
@Table(name = "users")
public class User extends BaseModel{

    private String name;
    private String lastName;
    private String login;
    private String password;


}
