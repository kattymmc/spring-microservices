package academy.digitallab.store.servicecostumer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import academy.digitallab.store.servicecostumer.repository.entity.Customer;
import academy.digitallab.store.servicecostumer.repository.entity.Region;

public interface CustomerRepository  extends JpaRepository<Customer,Long> {
    public Customer findByNumberID(String numberID);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByRegion(Region region);
}