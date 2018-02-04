package pl.czmyras.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.czmyras.webstore.domain.Product;
import pl.czmyras.webstore.domain.repository.ProductRepository;

import java.math.BigDecimal;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/products")
    public String list(Model model) {
        model.addAttribute("products", productRepository.getAllProducts());
        return "products";
    }
}
