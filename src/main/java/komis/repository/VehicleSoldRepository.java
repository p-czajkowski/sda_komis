package komis.repository;

import komis.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleSoldRepository extends JpaRepository<Vehicle, Integer> {

    Vehicle findBySold(Boolean sold);
}
