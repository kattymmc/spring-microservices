package academy.digitallab.store.servicecostumer.service;

import java.util.List;

import academy.digitallab.store.servicecostumer.repository.entity.Customer;
import academy.digitallab.store.servicecostumer.repository.entity.Region;

public interface CustomerService {

    public List<Customer> findCustomerAll();
    public List<Customer> findCustomersByRegion(Region region);

    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public Customer deleteCustomer(Customer customer);
    public  Customer getCustomer(Long id);

}