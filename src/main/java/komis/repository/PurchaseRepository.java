package komis.repository;

import komis.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

    List<Purchase> findPurchaseByUserId(Integer userId);
    List<Purchase> findPurchaseById(Integer purchaseId);
}
