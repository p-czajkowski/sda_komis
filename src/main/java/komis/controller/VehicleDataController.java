package komis.controller;

import komis.model.Vehicle;
import komis.service.VehicleDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

@Controller
@RequestMapping("/vehicles")
public class VehicleDataController {

   private final VehicleDataService vehicleDataService;

    public VehicleDataController(VehicleDataService vehicleDataService) {
        this.vehicleDataService = vehicleDataService;
    }

    @RequestMapping(method = RequestMethod.GET)
    private String showAvailableVehicles(Model model) {
        List<Vehicle> vehicles = vehicleDataService.loadVehiclesThatCanBeSold();
        vehicles.sort(Comparator.comparing(Vehicle::getId));
        model.addAttribute("vehiclesList", vehicles);
        return "vehicleList";
    }

    @RequestMapping("/{id}")
    public String getCar(
            @PathVariable("id") Integer vehicleId, Model model){
        Vehicle vehicle = vehicleDataService.getById(vehicleId);
        if (vehicleId != null) {
            model.addAttribute("vehicle", vehicle);
        }
        return "vehicleDetails";
    }


}
