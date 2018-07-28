package komis.controller;

import komis.model.Dto.PersonDto;
import komis.model.Dto.UserDto;
import komis.model.Person;
import komis.model.User;
import komis.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class UserDataController {

    private final UserService userService;


    public UserDataController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String loginToService(Model model){
        model.addAttribute("user", new User());
        return "pages/loginPage";
    }

    @RequestMapping("komis/logout")
    public String logoutFromService(Model model){
        return "logout";
    }

    @GetMapping("/createAccount")
    public String createUser(Model model){

        model.addAttribute("createUser", new UserDto());

        return "pages/createUserPage";
    }


    @PostMapping("/createAccount")
    public String createNewUser(
            @Valid @ModelAttribute("createUser") UserDto userDto,
            BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "pages/loginPage";
        }
        User user = new User();
        user.setLogin(userDto.getLogin());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());

        userService.addUser(user);

        return "redirect:/komis/list";
    }

    @GetMapping("/addClient")
    public String createNewClientAccount(Model model){
        model.addAttribute("createClient", new Person());
        return "pages/addClientPage";
    }

    @PostMapping("/addClient")
    public String createNewClientAccountPost(
            @ModelAttribute("createClient")PersonDto personDto, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "pages/addClientPage";
        }

        Person person = new Person();
        person.setName(personDto.getName());
        person.setLastName(personDto.getLastName());
        person.setAdress(personDto.getAdress());
        person.setPesel(personDto.getPesel());
        person.setNip(personDto.getNip());
        userService.addNewClient(person);

        return "redirect:/komis/list";
    }

}
