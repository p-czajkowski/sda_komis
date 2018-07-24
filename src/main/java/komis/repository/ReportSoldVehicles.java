package komis.repository;

import komis.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportSoldVehicles extends JpaRepository<Vehicle, Integer> {

    @Query("select v from Vehicle v where v.sold = true")
    List<Vehicle> findBySold();
}
