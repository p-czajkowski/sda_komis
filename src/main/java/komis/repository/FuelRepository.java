package komis.repository;

import komis.model.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelRepository extends JpaRepository<Fuel, Integer> {
}
