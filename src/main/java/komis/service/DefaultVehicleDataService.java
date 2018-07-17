package komis.service;

import komis.model.Vehicle;
import komis.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultVehicleDataService implements VehicleDataService {


    private final VehicleRepository vehicleRepository;

    public DefaultVehicleDataService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> loadVehiclesThatCanBeSold() {
        return vehicleRepository.findAllVehicleBySoldFalse();
    }

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
       return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle getById(Integer vehicleId) {
        return vehicleRepository.findOne(vehicleId);
    }

}
