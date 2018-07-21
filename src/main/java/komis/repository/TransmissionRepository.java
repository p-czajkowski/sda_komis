package komis.repository;

import komis.model.Transmission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransmissionRepository extends JpaRepository<Transmission, Integer> {

    Transmission getTransmissionById(Integer id);
}
