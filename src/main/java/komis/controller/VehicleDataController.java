package komis.controller;

import komis.model.Manufacturer;
import komis.model.PurchaseFormData;
import komis.model.Vehicle;
import komis.model.VehicleDto;
import komis.service.VehicleDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/auto-komis-sda")
public class VehicleDataController {

   private final VehicleDataService vehicleDataService;

    public VehicleDataController(VehicleDataService vehicleDataService) {
        this.vehicleDataService = vehicleDataService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showAvailableVehicles(Model model) {
        List<Vehicle> vehicle = vehicleDataService.loadVehiclesThatCanBeSold();
        model.addAttribute("vehiclesList", vehicle);
        return "vehicleList";
    }

    @RequestMapping("/{id}")
    public String getVehicle(
            @PathVariable("id")
                    Integer vehicleId, Model model){
        Vehicle vehicle = vehicleDataService.getById(vehicleId);
        if (vehicleId != null) {
            model.addAttribute("vehicle", vehicle);
        }
        return "vehicleDetails";
    }

    @GetMapping("/nowy")
    public String addVehicleForm(Model model){
        model.addAttribute("addedVehicle", new Vehicle());
        return "addVehicle";
    }

    @GetMapping("/{vehicleId}/sprzedaz")
    public String sellVehicleForm(
            @PathVariable("vehicleId") Integer vehicleId, Model model) {
        model.addAttribute("vehicleId", vehicleId);
        model.addAttribute("sellData", new PurchaseFormData());
        return "sellVehicle";
    }

    @PostMapping
    public String saveVehicle(
            @ModelAttribute("addedVehicle") VehicleDto vehicleToBeSaved){

        Vehicle vehicle = new Vehicle();

        vehicle.setManufacturer(vehicleToBeSaved.getManufacturer());
        vehicle.setModel(vehicleToBeSaved.getModel());
        vehicle.setMileage(vehicleToBeSaved.getMileage());
        vehicle.setFuel(vehicleToBeSaved.getFuel());
        vehicle.setEngine(vehicleToBeSaved.getEngine());
//        vehicle.setTransmission(vehicleToBeSaved.getTransmission());
        vehicle.setProductionYear(vehicleToBeSaved.getProductionYear());
        vehicle.setCarRegistration(vehicleToBeSaved.getCarRegistration());
        vehicle.setInsuranceNumber(vehicleToBeSaved.getInsuranceNumber());
        vehicle.setPower(vehicleToBeSaved.getPower());
        vehicle.setDescription(vehicleToBeSaved.getDescription());
        vehicle.setTestDrives(vehicleToBeSaved.getTestDrives());
        vehicle.setPrice(vehicleToBeSaved.getPrice());

        vehicleDataService.addVehicle(vehicle);
        return "redirect:/auto-komis-sda";
    }

}
