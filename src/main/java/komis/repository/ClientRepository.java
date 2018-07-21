package komis.repository;

import komis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository<User, Integer> {

//    @Query("SELECT c FROM Client c WHERE c.id = :clients_id")
//    User findClientById(@Param("clients_id") Integer id);

}
