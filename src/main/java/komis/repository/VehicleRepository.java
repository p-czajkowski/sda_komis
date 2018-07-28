package komis.repository;

import komis.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

//    @Query("SELECT v FROM Vehicle v WHERE v.id = :vehicleId AND v.sold  = false")
//    Optional<Vehicle> findNotSoldVehicle();

    List<Vehicle> findAllVehicleBySoldFalse();
//    @Query("select v from Vehicle v where v.sold = 1")
    List<Vehicle> findAllBySoldIsTrue();


}
