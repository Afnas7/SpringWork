package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.Model.Product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ProductController {

    @GetMapping("/product")
    public String getProduct(Model model) {
        Product Product = new Product(101,"Sugar",(float) 55.5);
        model.addAttribute("product", Product);
        return "product";
    }
    @GetMapping("/products")
    public String getProducts(Model model) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Sugar",(float) 36.7));
        products.add(new Product(102, "Salt",(float) 20.0));
        products.add(new Product(103, "Wheat Flour",(float) 38.75));
        model.addAttribute("products", products);
        return "productList";
}
}