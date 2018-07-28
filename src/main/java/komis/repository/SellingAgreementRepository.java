package komis.repository;

import komis.model.SellingAgreement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellingAgreementRepository extends JpaRepository<SellingAgreement, Integer> {
}
