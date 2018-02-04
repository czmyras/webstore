package pl.czmyras.webstore.domain.repository;

import pl.czmyras.webstore.domain.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAllProducts();
}
