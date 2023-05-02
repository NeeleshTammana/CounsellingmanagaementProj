package com.klef.jfsd.springboot.project.service;

import java.util.List; 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.project.model.BookSlots;
import com.klef.jfsd.springboot.project.repository.BookSlotsRepository;

@Service
public class BookSlotsImpl implements BookSlotsService {

	@Autowired
	private BookSlotsRepository bookSlotsRepository;
	
	public BookSlots savebookslots(BookSlots bookSlots)
	{
		return bookSlotsRepository.save(bookSlots);
	}
	
	public List<BookSlots> viewallBookSlots(){
		return bookSlotsRepository.findAll();
	}
}
