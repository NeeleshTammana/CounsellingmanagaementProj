package com.klef.jfsd.springboot.project.service;

import java.util.List;


import com.klef.jfsd.springboot.project.model.Admin;
import com.klef.jfsd.springboot.project.model.BookSlots;
import com.klef.jfsd.springboot.project.model.Counsellor;
import com.klef.jfsd.springboot.project.model.Student;

public interface AdminService
{
	public Admin checkadminlogin(String uname,String pwd);
	public List<Counsellor> viewallcounsellors();
	public List<Student> viewallstudents();
	
//	public void deleteemployee(int id);
//	public Mentor viewemployeebyid(int id);
}
