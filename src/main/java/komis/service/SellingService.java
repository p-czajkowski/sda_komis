package komis.service;

import komis.model.Client;
import komis.model.Purchase;
import komis.model.Vehicle;
import java.util.Date;

public interface SellingService {

    Purchase sell(Vehicle vehicleId, Client clientId, Date date, Integer price);
//    List<Purchase> loadHistory(Integer purchaseId);

    Purchase loadPurchaseById(Integer id);
}

