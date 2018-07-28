package komis.repository;

import komis.model.BuyingAgreement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyingAgreementRepository extends JpaRepository<BuyingAgreement, Integer> {
}
