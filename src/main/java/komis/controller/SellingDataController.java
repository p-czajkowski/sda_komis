package komis.controller;

import komis.model.Dto.PersonDto;
import komis.model.Person;
import komis.model.Dto.PurchaseDto;
import komis.model.Purchase;
import komis.model.Vehicle;
import komis.repository.PersonRepository;
import komis.service.SellingService;
import komis.service.VehicleDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;

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
        model.addAttribute("vehicleId", vehicleToBeSold);
        model.addAttribute("soldVehicle", purchaseDto);

        return new ModelAndView("pages/sellVehiclePage",model);
    }

    @PostMapping("/sellVehicle")
    public String sellVehicle(
            @Valid @ModelAttribute("soldVehicle")PurchaseDto purchaseDto,
            BindingResult bindingResult){

        if(bindingResult.hasErrors()) {
            return "pages/sellVehiclePage";
        }

        Person person = new Person();
        person.setName(purchaseDto.getName());
        person.setLastName(purchaseDto.getLastName());
        person.setAdress(purchaseDto.getAdress());
        person.setPesel(purchaseDto.getPesel());
        person.setNip(purchaseDto.getNip());

        sellingService.sellVehicle(purchaseDto.getVehicleId(), person, purchaseDto.getSellPrice());

        return "redirect:/komis/list";
    }
}
