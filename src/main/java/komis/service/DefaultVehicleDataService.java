package komis.service;

import komis.model.*;
import komis.model.Dto.VehicleDto;
import komis.repository.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DefaultVehicleDataService implements VehicleDataService {


    private final VehicleRepository vehicleRepository;
    private final TransmissionRepository transmissionRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final FuelRepository fuelRepository;
    private final VehicleTypeRepository vehicleTypeRepository;
    private final ModelRepository modelRepository;
    private final SellingAgreementRepository sellingAgreementRepository;

    public DefaultVehicleDataService(
            VehicleRepository vehicleRepository, TransmissionRepository transmissionRepository,
            ManufacturerRepository manufacturerRepository, FuelRepository fuelRepository,
            VehicleTypeRepository vehicleTypeRepository, ModelRepository modelRepository, SellingAgreementRepository sellingAgreementRepository) {
        this.vehicleRepository = vehicleRepository;
        this.transmissionRepository = transmissionRepository;
        this.manufacturerRepository = manufacturerRepository;
        this.fuelRepository = fuelRepository;
        this.vehicleTypeRepository = vehicleTypeRepository;
        this.modelRepository = modelRepository;
        this.sellingAgreementRepository = sellingAgreementRepository;
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


    public List<Vehicle> getAllVehicles(){
        return vehicleRepository.findAll();
    }

    @Override
    public List<Vehicle> showBoughtVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public List<Vehicle> showSoldVehicles() {
        return vehicleRepository.findAllBySoldIsTrue();
    }

    @Override
    public List<Vehicle> showAvailableVehicles() {
        return vehicleRepository.findAllVehicleBySoldFalse();
    }


//    public List<DtoShowCar> showCars() {
//        List<Cars> cars = (List<Cars>) carsRepository.findAll();
//        List<BuyingContracts> buyingContracts = (List<BuyingContracts>) buyingContractsRepository.findAll();
//        List<SellingContracts> sellingContracts = (List<SellingContracts>) sellingContractsRepository.findAll();
//        List<DtoShowCar> list = new ArrayList<>();
//        for (Cars c : cars) {
//
//            DtoShowCar dtoShowCar = new DtoShowCar();
//            dtoShowCar.setId(c.getId());
//            dtoShowCar.setCarManufacturer(c.getManufacturer());
//            dtoShowCar.setCarModel(c.getModel());
//            dtoShowCar.setCarYearProduction(c.getYearProduction());
//            dtoShowCar.setCarMilage(c.getMilage());
//            dtoShowCar.setCarNrChassis(c.getNrChassis());
//            dtoShowCar.setCarPrice(c.getPrice());
//            dtoShowCar.setCarVisibility(c.getVisibility());
//
//            for (BuyingContracts bc : buyingContracts) {
//                if (c.getId().equals((bc.getDate()))) {
//                    dtoShowCar.setPurchaseDate(bc.getDate());
//                    break;
//                }
//            }
//
//            for (SellingContracts sc : sellingContracts) {
//                if (c.getId().equals(sc.getCars().getId())) {
//                    dtoShowCar.setSaleDate(sc.getDate());
//                    break;
//                }
//            }
//
//
//            list.add(dtoShowCar);
//
//        }
//
//        return list;
//    }


//    public List<VehicleDto> showSoldCars() {
//        List<VehicleDto> listIn = vehicleRepository.findAllBySoldIsTrue();
//        List<VehicleDto> listOut = new ArrayList<>();
//        List<SellingAgreement> sellingAgreement = (List<SellingAgreement>) sellingAgreementRepository.findAll();
//        for (SellingAgreement sa : sellingAgreement) {
//            for (VehicleDto vehicleDto : listIn) {
//                if ((sa.getVehicle().getId().equals(vehicleDto.getId()))) {
//                    listOut.add(vehicleDto);
//                    break;
//                }
//            }
//        }
//        return listOut;
//    }
    public List<Vehicle> showSoldCars() {
        List<Vehicle> listIn = vehicleRepository.findAllBySoldIsTrue();
        List<Vehicle> listOut = new ArrayList<>();
        List<SellingAgreement> sellingAgreement = (List<SellingAgreement>) sellingAgreementRepository.findAll();
        for (SellingAgreement sa : sellingAgreement) {
            for (Vehicle vehicle : listIn) {
                if ((sa.getVehicle().getId().equals(vehicle.getId()))) {
                    listOut.add(vehicle);
                    break;
                }
            }
        }
        return listOut;
    }

}
