package komis.repository;

import komis.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehicleSoldRepository extends JpaRepository<Vehicle, Integer> {

    @Query("select v from Vehicle v where v.sold = false")
    List<Vehicle> findNotSoldVehicle();
}
