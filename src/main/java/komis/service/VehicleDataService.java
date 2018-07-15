package komis.service;

import komis.model.Vehicle;

import java.util.List;

public interface VehicleDataService {
    List<Vehicle> loadVehiclesThatCanBeSold();
    Vehicle addVehicle(Vehicle vehicle);
    Vehicle getById(Integer vehicleId);
}
