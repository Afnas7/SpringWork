package com.example.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Model.BookModel;
import com.example.demo.Repository.BookRepository;
@Controller
public class BookController{
	private final BookRepository repository;
	public BookController(BookRepository repository) {
		this.repository=repository;
	}
    // Show form
    @GetMapping("/add-book")
    public String showForm(Model model) {
        model.addAttribute("book", new BookModel());
        return "addbook";
    }

    // Save product
    @PostMapping("/save-book")
    public String saveBook(@ModelAttribute BookModel book) {
        repository.save(book);
        return "redirect:/book";
    }

    // Show all products
    @GetMapping("/book")
    public String showbooks(Model model) {
        model.addAttribute("books", repository.findAll());
        return "book";
    }
}