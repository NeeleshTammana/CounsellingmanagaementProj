package com.klef.jfsd.springboot.project.repository;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.klef.jfsd.springboot.project.model.Counsellor;

public interface CounsellorRepository extends CrudRepository<Counsellor, Integer>
{
	@Query("select c from Counsellor c where username=?1 and password=?2")
	public Counsellor checkcounsellorlogin(String uname,String pwd);
	
	@Query("select c from Counsellor c where username=?1")
	public Counsellor viewcounsellor(String uname);
	@Transactional
	@Modifying
	@Query("update Counsellor c set c.password=?1 where c.password=?2 and c.username=?3")
	public int updatecnslrpassword(String empnewpwd,String empoldpwd,String empuname);
	
	
}
