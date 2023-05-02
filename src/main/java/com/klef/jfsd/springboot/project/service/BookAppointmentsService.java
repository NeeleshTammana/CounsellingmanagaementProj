package com.klef.jfsd.springboot.project.service;

import java.util.List;

import com.klef.jfsd.springboot.project.model.BookAppointments;


public interface BookAppointmentsService {
public BookAppointments savebookappointments(BookAppointments bookappointments);
public List<BookAppointments> viewallbookappointments();
}
