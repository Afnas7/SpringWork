package com.example.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Model.ProductModel;
import com.example.demo.Repository.ProductRepository;
@Controller
public class ProductController{
	private final ProductRepository repository;
	public ProductController(ProductRepository repository) {
		this.repository=repository;
	}
    // Show form
    @GetMapping("/add-product")
    public String showForm(Model model) {
        model.addAttribute("product", new ProductModel());
        return "addproduct";
    }

    // Save product
    @PostMapping("/save-product")
    public String saveProduct(@ModelAttribute ProductModel product) {
        repository.save(product);
        return "redirect:/product";
    }

    // Show all products
    @GetMapping("/product")
    public String showProducts(Model model) {
        model.addAttribute("products", repository.findAll());
        return "product";
    }
}