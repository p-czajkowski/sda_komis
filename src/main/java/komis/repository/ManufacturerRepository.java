package komis.repository;

import komis.model.Manufacturer;
import org.springframework.data.repository.CrudRepository;


public interface ManufacturerRepository extends CrudRepository<Manufacturer, Integer> {

    Manufacturer getManufacturerByName(String manufacturerName);
    Manufacturer getManufacturerById(Integer manufacturerId);
}
