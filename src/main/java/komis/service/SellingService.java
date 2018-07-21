package komis.service;

import komis.model.Purchase;
import komis.model.User;
import komis.model.Vehicle;
import java.util.Date;

public interface SellingService {

    Purchase sell(Vehicle vehicleId, User userId, Date date, Integer price);
//    List<Purchase> loadHistory(Integer purchaseId);

    Purchase loadPurchaseById(Integer id);
    User loadPurchaseByUserId(Integer id);
}

