package komis.service;

import komis.model.Purchase;
import komis.model.User;
import komis.model.Vehicle;
import komis.repository.ClientRepository;
import komis.repository.PurchaseRepository;
import komis.repository.UserRepository;
import komis.repository.VehicleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class DefaultSellingService implements SellingService {

    private final VehicleRepository vehicleRepository;
    private final UserRepository userRepository;
    private final PurchaseRepository purchaseRepository;

    public DefaultSellingService(VehicleRepository vehicleRepository, UserRepository userRepository, PurchaseRepository purchaseRepository) {
        this.vehicleRepository = vehicleRepository;
        this.userRepository = userRepository;
        this.purchaseRepository = purchaseRepository;
    }

    @Transactional
    public Purchase sell(Vehicle vehicleId, User user, Date date, Integer price) {

       return vehicleRepository.findNotSoldVehicle()
                .map(vehicle -> performSell(vehicleId, user, date, price))
                .orElseGet(null);
    }

    @Override
    public Purchase loadPurchaseById(Integer id) {
        return purchaseRepository.findOne(id);
    }

    @Override
    public User loadPurchaseByUserId(Integer id) {
        return userRepository.findOne(id);
    }

//    @Override
//    public User loadPurchaseById(Integer id) {
//        return userRepository.findOne(id);
//    }

    public Purchase performSell(Vehicle vehicle, User user, Date date, Integer price) {
        vehicle.setSold(true);
        vehicleRepository.save(vehicle);
        User persistedUser = userRepository.findUserById(user.getId());

        Purchase purchase = new Purchase();
        purchase.setVehicleId(vehicle);
        purchase.setUserId(persistedUser);
        purchase.setDate(date);
        purchase.setPrice(price);

        return purchase;

    }
}
