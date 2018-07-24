package komis.service;

import komis.model.Person;
import komis.model.Purchase;
import komis.model.Vehicle;

public interface SellingService {

    Purchase sellVehicle(Integer vehicleId, Person personId, Integer price);

    Person getById(Integer personId);
    Person getPersonByPesel(Integer pesel);
//    Vehicle getBySellPrice(Integer sellPrice);

}

