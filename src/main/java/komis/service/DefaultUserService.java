package komis.service;

import komis.model.User;
import komis.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class DefaultUserService implements UserService{

    private final UserRepository userRepository;

    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
