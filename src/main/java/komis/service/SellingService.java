package komis.service;

import komis.model.Client;
import komis.model.Purchase;

public interface SellingService {

    Purchase sellVehicle(Integer vehicleId, Client clientId, Integer price);

    Client getClientById(Integer clientId);
}

