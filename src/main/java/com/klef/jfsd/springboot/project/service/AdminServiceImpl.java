package com.klef.jfsd.springboot.project.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.klef.jfsd.springboot.project.model.Admin;
import com.klef.jfsd.springboot.project.model.BookSlots;
import com.klef.jfsd.springboot.project.model.Counsellor;
import com.klef.jfsd.springboot.project.model.Student;
import com.klef.jfsd.springboot.project.repository.AdminRepository;
import com.klef.jfsd.springboot.project.repository.BookSlotsRepository;
import com.klef.jfsd.springboot.project.repository.CounsellorRepository;
import com.klef.jfsd.springboot.project.repository.StudentRepository;

@Service
public class AdminServiceImpl implements AdminService 
{
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private CounsellorRepository counsellorRepository;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private BookSlotsRepository bookslotsRepository;
	
//	@Autowired
//	private EmployeeRepository employeeRepository;

	@Override
	public Admin checkadminlogin(String uname, String pwd)
	{
		return adminRepository.checkadminlogin(uname, pwd);
		 
	}
//	@Override
	public List<Counsellor> viewallcounsellors()
	{
		
		return (List<Counsellor>) counsellorRepository.findAll();
	}
	public List<Student> viewallstudents()
	{
		
		return (List<Student>) studentRepository.findAll();
	}
	
	
//	@Override
//	public void deleteemployee(int id)
//	{
//		
//	 employeeRepository.deleteById(id);
//		
//	}
//	@Override
//	public Employee viewemployeebyid(int id) 
//	{
//		
//		return employeeRepository.findById(id).get();
//	}
	

}
