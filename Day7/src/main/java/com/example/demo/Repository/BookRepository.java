package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Model.BookModel;

public interface BookRepository  extends CrudRepository<BookModel, Integer>{
	
}