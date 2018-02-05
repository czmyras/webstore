package pl.czmyras.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.czmyras.webstore.domain.Product;
import pl.czmyras.webstore.domain.repository.ProductRepository;
import pl.czmyras.webstore.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public void processOrder(String productId, int count) {
        Product productById = productRepository.getProductById(productId);
        if (productById.getUnitsInStock() < count) {
            throw new IllegalArgumentException("Zbyt mało towaru. Obecna liczba sztuk w magazynie: " + productById.getUnitsInStock());
        }
        productById.setUnitsInStock(productById.getUnitsInStock() - count);

    }
}
