package pl.czmyras.webstore.service;

import pl.czmyras.webstore.domain.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProductService {

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    public Set<Product> getProductsByFilter(Map<String, List<String>> filtersParams);
}
