package komis.service;

import komis.model.Client;
import komis.model.Purchase;
import komis.model.Vehicle;
import komis.repository.ClientRepository;
import komis.repository.PurchaseRepository;
import komis.repository.VehicleRepository;
import komis.repository.VehicleSoldRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DefaultSellingService implements SellingService {

    private final VehicleRepository vehicleRepository;
    private final ClientRepository clientRepository;
    private final PurchaseRepository purchaseRepository;
    private final VehicleSoldRepository vehicleSoldRepository;

    public DefaultSellingService(VehicleRepository vehicleRepository, ClientRepository clientRepository, PurchaseRepository purchaseRepository, VehicleSoldRepository vehicleSoldRepository) {
        this.vehicleRepository = vehicleRepository;
        this.clientRepository = clientRepository;
        this.purchaseRepository = purchaseRepository;
        this.vehicleSoldRepository = vehicleSoldRepository;
    }


    @Override
    public Purchase sellVehicle(Integer soldVehicleId, Client clientId, Integer price) {
        Vehicle soldVehicle = vehicleRepository.findOne(soldVehicleId);
        soldVehicle.setSold(true);
        vehicleSoldRepository.findBySold(true);

        Client persistedClient = clientRepository.findByPesel(
                clientId.getPesel()).orElseGet(() -> clientRepository.save(clientId));

        Purchase purchase = new Purchase();

        purchase.setClientId(persistedClient);
        purchase.setVehicle(soldVehicle);
        purchase.setPrice(price);
        purchase.setDate(new Date());

        return purchase;
    }

    @Override
    public Client getClientById(Integer pesel) {
        return clientRepository.findOne(pesel);
    }
}
