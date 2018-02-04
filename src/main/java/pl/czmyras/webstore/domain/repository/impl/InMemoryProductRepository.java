package pl.czmyras.webstore.domain.repository.impl;

import org.springframework.stereotype.Repository;
import pl.czmyras.webstore.domain.Product;
import pl.czmyras.webstore.domain.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProductRepository implements ProductRepository {

    private List<Product> productList = new ArrayList<>();


    public InMemoryProductRepository() {
        Product iphone = new Product("P1234", "iPhone5S", new BigDecimal(500));
        iphone.setDescription("Applie iPhone 5S, smartfon z 4-calowym wyświetlaczem o rozdzielczości 640x1136 " +
                "oraz 8mpix aparatem");
        iphone.setCategory("Smart Phone");
        iphone.setManufacturer("Apple");
        iphone.setUnitsInStock(1000);

        Product laptop_Dell = new Product("P1235", "Dell Inspiron", new BigDecimal(700));
        iphone.setDescription("Dell Inspiron, 14-calowy laptop (czarny) z procesorem Intel Core 3. generacji");
        iphone.setCategory("Lapton");
        iphone.setManufacturer("Dell");
        iphone.setUnitsInStock(1000);

        Product tablet_Nexus = new Product("P1236", "Nexus 7", new BigDecimal(300));
        iphone.setDescription("Google Nexyus 7 je najlżejszym 7-calowym tabletem z 4-rdzeniowym procesorem Qualcom Snapdragon S4 Pro");
        iphone.setCategory("Tables");
        iphone.setManufacturer("Google");
        iphone.setUnitsInStock(1000);

        productList.add(iphone);
        productList.add(laptop_Dell);
        productList.add(tablet_Nexus);
    }

    @Override
    public List<Product> getAllProducts() {
        return productList;
    }
}
