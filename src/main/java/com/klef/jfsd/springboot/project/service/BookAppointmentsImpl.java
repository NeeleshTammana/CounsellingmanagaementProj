package com.klef.jfsd.springboot.project.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.project.model.BookAppointments;

import com.klef.jfsd.springboot.project.repository.BookAppointmentsRepository;
@Service
public class BookAppointmentsImpl implements BookAppointmentsService {

	@Autowired
	private BookAppointmentsRepository bookappointmentsrepository;
	
	public BookAppointments savebookappointments(BookAppointments bookappointments) {
		return bookappointmentsrepository.save(bookappointments);
	}

	public List<BookAppointments> BookAppointments(){
		return bookappointmentsrepository.findAll();
	}


	public List<BookAppointments> viewallbookappointments() {
		
		return bookappointmentsrepository.findAll();
	}



	
	

}
