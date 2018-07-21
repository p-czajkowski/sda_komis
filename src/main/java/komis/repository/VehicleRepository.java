package komis.repository;

import komis.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

//    @Query("SELECT v FROM Vehicle v WHERE v.id = :vehicleId AND v.sold  = false")
//    Optional<Vehicle> findNotSoldVehicle();

    List<Vehicle> findAllVehicleBySoldFalse();
}
