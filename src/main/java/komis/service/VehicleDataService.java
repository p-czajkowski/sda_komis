package komis.service;

import komis.model.*;

import java.util.List;

public interface VehicleDataService {
    List<Vehicle> loadVehiclesThatCanBeSold();

    Vehicle addVehicle(Vehicle vehicle);
    Vehicle getById(Integer vehicleId);

    Transmission getTransmissionById(Integer id);
    List<Transmission> getAllTransmissions();

    Manufacturer getManufacturerById(Integer id);
    List<Manufacturer> getAllManufacturers();

    Fuel getFuelById(Integer id);
    List<Fuel> getAllFuels();

    VehicleType getVehicleTypeById(Integer id);
    List<VehicleType> getAllVehicleTypes();

}
