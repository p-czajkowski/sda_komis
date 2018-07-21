package komis.service;

import komis.model.Client;
import komis.model.Purchase;

public interface SellingService {

    Purchase sellVehicle(Integer vehicleId, Client clientId, Integer price);
////    List<Purchase> loadHistory(Integer purchaseId);
//
//    Purchase loadPurchaseById(Integer purchaseid);
//    User loadPurchaseByUserId(Integer userid);

    Client getClientById(Integer clientId);
}

