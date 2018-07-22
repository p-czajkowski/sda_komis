package komis.controller;

import komis.model.Client;
import komis.model.Dto.PurchaseDto;
import komis.model.Vehicle;
import komis.service.SellingService;
import komis.service.VehicleDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sells")
public class SellingDataController {

    private final SellingService sellingService;
    private final VehicleDataService vehicleDataService;

    public SellingDataController(SellingService sellingService, VehicleDataService vehicleDataService) {
        this.sellingService = sellingService;
        this.vehicleDataService = vehicleDataService;
    }

    @GetMapping("/{id}/sell")
    public ModelAndView sellVehicleForm(
            @PathVariable("id") Integer vehicleId, ModelMap model) {
        Vehicle vehicleToBeSold = vehicleDataService.getById(vehicleId);
        PurchaseDto purchaseDto = new PurchaseDto();
        purchaseDto.setVehicle(vehicleToBeSold);
        purchaseDto.setVehicleId(vehicleId);
//        model.addAttribute("vehicleId", vehicleToBeSold);
        model.addAttribute("soldVehicle", purchaseDto);
        return new ModelAndView("sellVehicle",model);
    }

    @PostMapping("/sellVehicle")
    public String sellVehicle(
            @ModelAttribute("soldVehicle")PurchaseDto purchaseDto,
            BindingResult bindingResult){

        if(bindingResult.hasErrors()) {
            return "sellVehicle";
        }

        Client client = new Client();
        client.setName(purchaseDto.getName());
        client.setLastName(purchaseDto.getLastName());
        client.setAdress(purchaseDto.getAdress());
        client.setPesel(purchaseDto.getPesel());
        client.setNip(purchaseDto.getNip());

        sellingService.sellVehicle(purchaseDto.getVehicleId(), client, purchaseDto.getSellPrice());

        return "redirect:/komis/list";
    }
}
