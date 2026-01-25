package com.example.demo.Model;
import jakarta.persistence.*;
@Entity
@Table(name ="books")
public class BookModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String authorName;
	private double price;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
	        this.title = title;
	}

	// Getter for description
	public String getAuthorName() {
	        return authorName;
	}
	    // Setter for description
	public void setAuthorName(String authorName) {
	        this.authorName = authorName;
	}

	    // Getter for price
	    public double getPrice() {
	        return price;
	    }

	    // Setter for price
	    public void setPrice(double price) {
	        this.price = price;
	    }
}