package ma.com.inventoryservice.repositories;

import ma.com.inventoryservice.entities.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface InventoryItemRepository extends JpaRepository<InventoryItem,Long> {

    Optional<InventoryItem> findByProductCode(String productCode);
}
