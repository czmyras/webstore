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
        laptop_Dell.setDescription("Dell Inspiron, 14-calowy laptop (czarny) z procesorem Intel Core 3. generacji");
        laptop_Dell.setCategory("Lapton");
        laptop_Dell.setManufacturer("Dell");
        laptop_Dell.setUnitsInStock(1000);

        Product tablet_Nexus = new Product("P1236", "Nexus 7", new BigDecimal(300));
        tablet_Nexus.setDescription("Google Nexyus 7 je najlżejszym 7-calowym tabletem z 4-rdzeniowym procesorem Qualcom Snapdragon S4 Pro");
        tablet_Nexus.setCategory("Tablet");
        tablet_Nexus.setManufacturer("Google");
        tablet_Nexus.setUnitsInStock(1000);

        productList.add(iphone);
        productList.add(laptop_Dell);
        productList.add(tablet_Nexus);
    }

    @Override
    public List<Product> getAllProducts() {
        return productList;
    }

    @Override
    public Product getProductById(String productId) {
        Product productById = null;

        for (Product product: productList) {
            if (product != null && product.getProductId() != null & product.getProductId().equals(productId)) {
                productById = product;
                break;
            }
        }

        if (productById == null) {
            throw new IllegalArgumentException("Brak produktu o wskazanym id: " + productId);
        }

        return productById;
    }

    @Override
    public List<Product> getProductsByCategory(String category) {

        List<Product> productsByCategory = new ArrayList<>();

        productList.forEach((product) -> {
            if (category.equalsIgnoreCase(product.getCategory())) {
                productsByCategory.add(product);
            }
        });

        return productsByCategory;

    }
}
