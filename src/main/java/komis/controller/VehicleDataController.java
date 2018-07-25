package komis.controller;

import komis.model.Dto.VehicleDto;
import komis.model.*;
import komis.service.VehicleDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/komis")
public class VehicleDataController {

    private final VehicleDataService vehicleDataService;

    public VehicleDataController(VehicleDataService vehicleDataService) {
        this.vehicleDataService = vehicleDataService;
    }

    @GetMapping("/list")
    public String showAvailableVehicles(Model model) {
        List<Vehicle> vehicle = vehicleDataService.loadVehiclesThatCanBeSold();
        model.addAttribute("vehiclesList", vehicle);
        return "pages/vehicleList";
    }

    @GetMapping("/details/{id}")
    public String getVehicle(
            @PathVariable("id")
                    Integer vehicleId, Model model) {
        Vehicle vehicle = vehicleDataService.getById(vehicleId);
        if (vehicleId != null) {
            model.addAttribute("vehicle", vehicle);
        }
        return "pages/vehicleDetails";
    }

    @GetMapping("/new")
    public String addVehicleForm(Model model) {

        model.addAttribute("addedVehicle", new VehicleDto());

        List<Manufacturer> allManufacturers = vehicleDataService.getAllManufacturers();
        model.addAttribute("allManufacturers", allManufacturers);
        List<Transmission> allTransmissions = vehicleDataService.getAllTransmissions();
        model.addAttribute("allTransmissions", allTransmissions);
        List<Fuel> allFuels = vehicleDataService.getAllFuels();
        model.addAttribute("allFuels", allFuels);
        List<VehicleType> allVehicleTypes = vehicleDataService.getAllVehicleTypes();
        model.addAttribute("allVehicleTypes", allVehicleTypes);

        return "pages/addVehiclePage";
    }

    @PostMapping("/new")
    public String saveVehicle(
            @Valid @ModelAttribute("addedVehicle") VehicleDto vehicleToBeSaved,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {

            return "redirect:/komis/new";
        }

        Vehicle vehicle = new Vehicle();

        vehicle.setManufacturer(vehicleDataService.getManufacturerById(vehicleToBeSaved.getManufacturer()));
        vehicle.setModel(vehicleToBeSaved.getModel());
        vehicle.setMileage(vehicleToBeSaved.getMileage());
        vehicle.setFuel(vehicleDataService.getFuelById(vehicleToBeSaved.getFuel()));
        vehicle.setEngine(vehicleToBeSaved.getEngine());
        vehicle.setTransmission(vehicleDataService.getTransmissionById(vehicleToBeSaved.getTransmission()));
        vehicle.setProductionYear(vehicleToBeSaved.getProductionYear());
        vehicle.setVehicleType(vehicleDataService.getVehicleTypeById(vehicleToBeSaved.getVehicleType()));
        vehicle.setCarRegistration(vehicleToBeSaved.getCarRegistration());
        vehicle.setInsuranceNumber(vehicleToBeSaved.getInsuranceNumber());
        vehicle.setPower(vehicleToBeSaved.getPower());
        vehicle.setDescription(vehicleToBeSaved.getDescription());
        vehicle.setTestDrives(vehicleToBeSaved.getTestDrives());
        vehicle.setVin(vehicleToBeSaved.getVin());
        vehicle.setBuyPrice(vehicleToBeSaved.getBuyPrice());
        vehicle.setSellPrice(vehicleToBeSaved.getSellPrice());

        vehicleDataService.addVehicle(vehicle);
        return "redirect:/komis/list";
    }
}
