package komis.repository;

import komis.model.Vehicle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

    @Query("SELECT v FROM Vehicle v WHERE v.sold = false")
    List<Vehicle> findNotSoldVehicle();
}
