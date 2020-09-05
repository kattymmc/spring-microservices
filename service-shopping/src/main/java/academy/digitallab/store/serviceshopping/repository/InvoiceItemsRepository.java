package academy.digitallab.store.serviceshopping.repository;

import academy.digitallab.store.serviceshopping.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}