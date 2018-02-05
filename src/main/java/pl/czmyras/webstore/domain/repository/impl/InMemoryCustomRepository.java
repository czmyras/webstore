package pl.czmyras.webstore.domain.repository.impl;

import org.springframework.stereotype.Repository;
import pl.czmyras.webstore.domain.Customer;
import pl.czmyras.webstore.domain.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCustomRepository implements CustomerRepository{

    List<Customer> customerList = new ArrayList<>();

    @Override
    public List<Customer> getAllCustomers() {
        return customerList;
    }

    public InMemoryCustomRepository() {

        Customer uncleBob = new Customer("C1001", "Uncle Bob", "White House");
        Customer crazyFrog = new Customer("C1002", "Crazy Frog", "Stinking swamp");

        customerList.add(uncleBob);
        customerList.add(crazyFrog);
    }
}
