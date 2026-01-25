package com.example.demo.Model;
import jakarta.persistence.*;
@Entity
@Table(name ="products")
public class ProductModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private double price;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
	        this.name = name;
	}

	// Getter for description
	public String getDescription() {
	        return description;
	}

	    // Setter for description
	public void setDescription(String description) {
	        this.description = description;
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