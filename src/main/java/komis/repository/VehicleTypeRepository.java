package komis.repository;

import komis.model.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository <VehicleType, Integer> {
}
