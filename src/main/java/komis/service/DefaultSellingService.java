package komis.service;

import komis.model.Person;
import komis.model.Purchase;
import komis.model.Vehicle;
import komis.repository.PersonRepository;
import komis.repository.PurchaseRepository;
import komis.repository.VehicleRepository;
import komis.repository.VehicleSoldRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DefaultSellingService implements SellingService {

    private final VehicleRepository vehicleRepository;
    private final PersonRepository personRepository;
    private final PurchaseRepository purchaseRepository;
    private final VehicleSoldRepository vehicleSoldRepository;


    public DefaultSellingService(VehicleRepository vehicleRepository, PersonRepository personRepository, PurchaseRepository purchaseRepository, VehicleSoldRepository vehicleSoldRepository) {
        this.vehicleRepository = vehicleRepository;
        this.personRepository = personRepository;
        this.purchaseRepository = purchaseRepository;
        this.vehicleSoldRepository = vehicleSoldRepository;
    }


    @Override
    public Purchase sellVehicle(Integer soldVehicleId, Person person, Integer price) {
        Vehicle soldVehicle = vehicleRepository.findOne(soldVehicleId);
        soldVehicle.setSold(true);
        vehicleSoldRepository.save(soldVehicle);


        Person persistedPerson = personRepository.findByPesel(
                person.getPesel()).orElseGet(() -> personRepository.save(person));

        Purchase purchase = new Purchase();

        purchase.setPersonId(persistedPerson);
        purchase.setVehicleId(soldVehicle);
        purchase.setSellPrice(price);
        purchase.setDate(new Date());
        purchaseRepository.save(purchase);

        return purchase;
    }
}
