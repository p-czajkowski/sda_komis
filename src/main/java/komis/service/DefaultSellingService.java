package komis.service;

import komis.model.Client;
import komis.model.Purchase;
import komis.model.Vehicle;
import komis.repository.ClientRepository;
import komis.repository.PurchaseRepository;
import komis.repository.VehicleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class DefaultSellingService implements SellingService {

    private final VehicleRepository vehicleRepository;
    private final ClientRepository clientRepository;
    private final PurchaseRepository purchaseRepository;

    public DefaultSellingService(VehicleRepository vehicleRepository, ClientRepository clientRepository, PurchaseRepository purchaseRepository) {
        this.vehicleRepository = vehicleRepository;
        this.clientRepository = clientRepository;
        this.purchaseRepository = purchaseRepository;
    }

    @Transactional
    public Purchase sell(Vehicle vehicleId, final Client client, Date date, Integer price) {

       return vehicleRepository.findNotSoldVehicle()
                .map(vehicle -> performSell(vehicleId, client, date, price))
                .orElseGet(null);
    }

    @Override
    public Purchase loadPurchaseById(Integer id) {
        return purchaseRepository.findOne(id);
    }


    public Purchase performSell(Vehicle vehicle, Client client, Date date, Integer price) {
        vehicle.setSold(true);
        vehicleRepository.save(vehicle);
        Client persistedClient = clientRepository.findClientById(client.getId());

        Purchase purchase = new Purchase();
        purchase.setVehicleId(vehicle);
        purchase.setClientId(persistedClient);
        purchase.setDate(date);
        purchase.setPrice(price);

        return purchase;

    }
}
