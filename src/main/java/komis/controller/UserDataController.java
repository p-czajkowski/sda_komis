package komis.controller;

import komis.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserDataController {

    @RequestMapping("/login")
    public String loginToService(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping("komis/logout")
    public String logoutFromService(Model model){
        return "logout";
    }
}
