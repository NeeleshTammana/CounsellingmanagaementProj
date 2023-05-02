package com.klef.jfsd.springboot.project.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.project.model.Counsellor;
import com.klef.jfsd.springboot.project.repository.CounsellorRepository;
@Service
public class CounsellorServiceImpl implements CounsellorService
{
	@Autowired
	private CounsellorRepository CounsellorRepository;
	
	@Override
	public Counsellor addcounsellor(Counsellor counsellor) 
	{
		return CounsellorRepository.save(counsellor);
	}

	@Override
	public Counsellor checkcounsellorlogin(String uname, String pwd) {
		return CounsellorRepository.checkcounsellorlogin(uname, pwd);
	}

	@Override
	public Counsellor viewcounsellor(String uname) {
		return CounsellorRepository.viewcounsellor(uname);
	}
	@Override
	public int changecounsellorpassword(String empoldpwd, String empnewpwd, String empuname)
	{
		return CounsellorRepository.updatecnslrpassword(empnewpwd, empoldpwd, empuname);
		
	}

}
