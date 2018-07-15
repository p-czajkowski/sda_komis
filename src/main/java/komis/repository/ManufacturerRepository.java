package komis.repository;

import komis.model.Manufacturer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;


public interface ManufacturerRepository extends CrudRepository<Manufacturer, Integer> {
    @Query("SELECT m FROM Manufacturer m WHERE m.name = '?'")
    Set<Manufacturer> findManufacturerByName();

}
