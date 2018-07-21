package komis.service;

import komis.model.*;
import komis.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultVehicleDataService implements VehicleDataService {


    private final VehicleRepository vehicleRepository;
    private final TransmissionRepository transmissionRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final FuelRepository fuelRepository;
    private final VehicleTypeRepository vehicleTypeRepository;

    public DefaultVehicleDataService(
            VehicleRepository vehicleRepository, TransmissionRepository transmissionRepository,
            ManufacturerRepository manufacturerRepository, FuelRepository fuelRepository,
            VehicleTypeRepository vehicleTypeRepository) {
        this.vehicleRepository = vehicleRepository;
        this.transmissionRepository = transmissionRepository;
        this.manufacturerRepository = manufacturerRepository;
        this.fuelRepository = fuelRepository;
        this.vehicleTypeRepository = vehicleTypeRepository;
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

    @Override
    public Transmission getTransmissionById(Integer transmissionId) {
        return transmissionRepository.findOne(transmissionId);
    }

    @Override
    public List<Transmission> getAllTransmissions() {
        return transmissionRepository.findAll();
    }

    @Override
    public Manufacturer getManufacturerById(Integer id) {
        return manufacturerRepository.findOne(id);
    }

    @Override
    public List<Manufacturer> getAllManufacturers() {
        return (List<Manufacturer>) manufacturerRepository.findAll();
    }

    @Override
    public Fuel getFuelById(Integer id) {
        return fuelRepository.findOne(id);
    }

    @Override
    public List<Fuel> getAllFuels() {
        return fuelRepository.findAll();
    }

    @Override
    public VehicleType getVehicleTypeById(Integer id) {
        return vehicleTypeRepository.findOne(id);
    }

    @Override
    public List<VehicleType> getAllVehicleTypes() {
        return vehicleTypeRepository.findAll();
    }


}
