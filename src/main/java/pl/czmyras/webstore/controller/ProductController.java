package pl.czmyras.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.czmyras.webstore.domain.Product;

import java.math.BigDecimal;

@Controller
public class ProductController {

    @RequestMapping("/products")
    public String list(Model model) {
        Product iphone = new Product("P1234", "iPhone5S", new BigDecimal(500));
        iphone.setDescription("Applie iPhone 5S, smartfon z 4-calowym wyświetlaczem o rozdzielczości 640x1136 " +
                "oraz 8mpix aparatem");
        iphone.setCategory("Smart Phone");
        iphone.setManufacturer("Apple");
        iphone.setUnitsInStock(1000);
        model.addAttribute("product", iphone);
        return "products";
    }
}
