package pl.czmyras.webstore.domain;

import java.util.Objects;

public class Customer {

    String customerId;
    String name;
    String address;
    long noOfOrdersMade;

    public Customer() {
    }

    public Customer(String customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNoOfOrdersMade() {
        return noOfOrdersMade;
    }

    public void setNoOfOrdersMade(long noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return noOfOrdersMade == customer.noOfOrdersMade &&
                Objects.equals(customerId, customer.customerId) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerId, name, address, noOfOrdersMade);
    }
}
