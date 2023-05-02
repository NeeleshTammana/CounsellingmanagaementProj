package com.klef.jfsd.springboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.project.model.BookSlots;

@Repository
public interface BookSlotsRepository extends JpaRepository<BookSlots, Integer> {

}
