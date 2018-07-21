package komis.controller;

import komis.model.Client;
import komis.model.Purchase;
import komis.model.Dto.PurchaseDto;
import komis.service.SellingService;
import komis.service.VehicleDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sells")
public class SellingDataController {

    private final SellingService sellingService;
    private final VehicleDataService vehicleDataService;

    public SellingDataController(SellingService sellingService, VehicleDataService vehicleDataService) {
        this.sellingService = sellingService;
        this.vehicleDataService = vehicleDataService;
    }

    @GetMapping("/{id}")
    public String sellVehicleForm(
            @PathVariable("id") Integer vehicleId, Model model) {
        model.addAttribute("vehicleId", vehicleId);
        model.addAttribute("soldVehicle", new Purchase());
        return "sellVehicle";
    }

    @PostMapping("/sellVehicle")
    public String sellVehicle(
            @ModelAttribute("soldVehicle")PurchaseDto purchaseDto,
            BindingResult bindingResult){

        if(bindingResult.hasErrors()) {
            return "sellVehicle";
        }

        Client client = sellingService.getClientById(purchaseDto.getClientId());
        client.setName(purchaseDto.getName());
        client.setLastName(purchaseDto.getLastName());
        client.setAdress(purchaseDto.getAdress());
        client.setPesel(purchaseDto.getPESEL());
        client.setNip(purchaseDto.getNIP());

        sellingService.sellVehicle(purchaseDto.getVehicleId(), client, purchaseDto.getPrice());

        return "redirect/auto-komis-sda";
    }
}
