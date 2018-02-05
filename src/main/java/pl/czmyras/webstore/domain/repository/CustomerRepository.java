package pl.czmyras.webstore.domain.repository;

import pl.czmyras.webstore.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> getAllCustomers();
}
