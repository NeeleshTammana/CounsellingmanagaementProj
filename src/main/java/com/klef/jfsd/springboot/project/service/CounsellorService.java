package com.klef.jfsd.springboot.project.service;


import com.klef.jfsd.springboot.project.model.Counsellor;

public interface CounsellorService 
{
	public Counsellor addcounsellor(Counsellor counsellor);
	public Counsellor checkcounsellorlogin(String uname,String pwd);
	public Counsellor viewcounsellor(String uname);
	public int changecounsellorpassword(String empoldpwd,String empnewpwd,String empuname);
}
