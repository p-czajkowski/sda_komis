package komis.service;

import komis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService {

    User addUser(User user);

}
