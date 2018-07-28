package komis.service;

import komis.model.Person;
import komis.model.User;
import komis.repository.PersonRepository;
import komis.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class DefaultUserService implements UserService{

    private final UserRepository userRepository;
    private final PersonRepository personRepository;

    public DefaultUserService(UserRepository userRepository, PersonRepository personRepository) {
        this.userRepository = userRepository;
        this.personRepository = personRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Person addNewClient(Person newPerson) {
        return personRepository.save(newPerson);
    }
}
