package com.klef.jfsd.springboot.project.service;

import java.util.List;


import com.klef.jfsd.springboot.project.model.BookSlots;

public interface BookSlotsService {
public BookSlots savebookslots(BookSlots bookSlots);
public List<BookSlots> viewallBookSlots();
}
