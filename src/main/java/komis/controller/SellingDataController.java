package komis.controller;

import komis.model.Purchase;
import komis.model.Vehicle;
import komis.service.SellingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/auto-komis-sda/purchases")
public class SellingDataController {

    private final SellingService sellingService;

    public SellingDataController(SellingService sellingService) {
        this.sellingService = sellingService;
    }

//    @RequestMapping("/{id}/sell")
//    public String showVehicle(@PathVariable("id") Integer vehicleId, Model model){
//        Purchase purchase = sellingService.sell(vehicleId, )
//
//    }
}
