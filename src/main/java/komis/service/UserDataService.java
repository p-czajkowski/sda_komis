package komis.service;

import komis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataService {

    void save(User user);

    String findUserByLogin(String login);
}
