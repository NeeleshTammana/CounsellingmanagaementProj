package com.klef.jfsd.springboot.project.controller;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.klef.jfsd.springboot.project.model.Admin;
import com.klef.jfsd.springboot.project.model.BookSlots;
import com.klef.jfsd.springboot.project.model.Counsellor;
import com.klef.jfsd.springboot.project.model.BookAppointments;
import com.klef.jfsd.springboot.project.model.Student;
import com.klef.jfsd.springboot.project.repository.BookSlotsRepository;
import com.klef.jfsd.springboot.project.service.AdminService;
import com.klef.jfsd.springboot.project.service.BookAppointmentsService;
import com.klef.jfsd.springboot.project.service.BookSlotsService;
import com.klef.jfsd.springboot.project.service.CounsellorService;
import com.klef.jfsd.springboot.project.service.StudentService;

@Controller
public class ClientController
{

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private CounsellorService counsellorService;
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private BookSlotsService bookslotsService;
	@Autowired
	private BookAppointmentsService bookappointmentsService;

	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
	@GetMapping("/adminlogin")
	public ModelAndView adminlogindemo()
	{
		ModelAndView mv = new ModelAndView("adminlogin");
		return mv;
	}
	@GetMapping("/counsellorlogin")
	public ModelAndView mentorlogindemo()
	{
		ModelAndView mv = new ModelAndView("counsellorlogin");
		return mv;
	}
	@GetMapping("/studentlogin")
	public ModelAndView studentlogindemo()
	{
		ModelAndView mv = new ModelAndView("studentlogin");
		return mv;
	}
	@PostMapping("/checkcounsellorlogin")
	  public ModelAndView checkcounsellorlogindemo(HttpServletRequest request)
	  {
	    ModelAndView mv = new ModelAndView();
	    
	    String auname=request.getParameter("euname");
	    String apwd=request.getParameter("epwd");
	    
	    Counsellor counsellor = counsellorService.checkcounsellorlogin(auname, apwd);
	    
	    if(counsellor!=null)
	    {
	    	if(counsellor.getDesignation().equals("Counsellor")) {
	    		HttpSession session = request.getSession();
	  	      session.setAttribute("auname", auname);
	  	      mv.setViewName("counsellorhome");
	
	    	}else {
	    		HttpSession session = request.getSession();
		  	      session.setAttribute("auname", auname);
		  	      mv.setViewName("studenthome");
	    	}
	     }
	    else
	    {
	      mv.setViewName("counsellorlogin");
	      mv.addObject("msg","Login Failed");
	    }
	    return mv;
	  }
	@PostMapping("/checkstudentlogin")
	public ModelAndView checkstudentlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		String auname=request.getParameter("euname");
		String apwd=request.getParameter("epwd");
		
		Student admin = studentService.checkstudentlogin(auname, apwd);
		
		if(admin!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("auname", auname);
			mv.setViewName("studenthome");
		}
		else
		{
			mv.setViewName("studentlogin");
			mv.addObject("msg","Login Failed");
		}
		return mv;
	}
	@PostMapping("/checkadminlogin")
	public ModelAndView checkadminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String auname=request.getParameter("auname");
		String apwd=request.getParameter("apwd");
		
		Admin admin = adminService.checkadminlogin(auname, apwd);
		
		if(admin!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("auname", auname);
			mv.setViewName("adminhome");
		}
		else
		{
			mv.setViewName("adminlogin");
			mv.addObject("msg","Login Failed");
		}
		return mv;
	}
//	@GetMapping("/employeelogin")
//	public ModelAndView employeelogindemo()
//	{
//		ModelAndView mv = new ModelAndView("employeelogin");
//		return mv;
//	}
//	@GetMapping("/employeereg")
//	public ModelAndView employeeregdemo()
//	{
//			 ModelAndView mv = new ModelAndView("employeeregistration","emp",new Employee());
//			 return mv;
////	}
	@GetMapping("/adminhome")
	public ModelAndView adminhomedemo()
	{
		ModelAndView mv = new ModelAndView("adminhome");
		return mv;
	}
	@GetMapping("/counsellorhome")
	public ModelAndView counsellorhomedemo()
	{
		ModelAndView mv = new ModelAndView("counsellorhome");
		return mv;
	}
	@GetMapping("/studenthome")
	public ModelAndView studenthomedemo()
	{
		ModelAndView mv = new ModelAndView("studenthome");
		return mv;
	}
//	@GetMapping("/employeehome")
//	public ModelAndView employeehomedemo(HttpServletRequest request)
//	{
//		ModelAndView mv = new ModelAndView("emplpoyeehome");
//		HttpSession session = request.getSession();
//		String euname = (String) session.getAttribute("euname");
//		mv.addObject("ename", euname);
//		return mv;
//	}
//	@GetMapping("/viewallemps")
//	public ModelAndView viewallempsdemo()
//	{
//		ModelAndView mv = new ModelAndView("viewallemployees");
//		List<Counsellor> emplist=adminService.viewallemployees();
//		mv.addObject("emplist",emplist);
	//	return mv;
	//}
	
	/*@PostMapping("/checkcounsellorlogin")
	public ModelAndView checkmenlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String euname=request.getParameter("euname");
		String epwd=request.getParameter("epwd");
		
		Counsellor men= counsellorService.checkcounsellorlogin(euname, epwd);
		
		if(men!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("euname", euname);
			mv.setViewName("counsellorhome");
		}
		else 
		{
			mv.setViewName("counsellorhome");
			mv.addObject("msg","Login Failed");
		}
		return mv;
	} */
	/*@PostMapping("/checkstudentlogin")
	public ModelAndView checkstudentlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String euname=request.getParameter("euname");
		String epwd=request.getParameter("epwd");
		
		Student stu= studentService.checkstudentlogin(euname, epwd);
		
		if(stu!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("euname", euname);
			mv.setViewName("studenthome");
		}
		else
		{
			mv.setViewName("studenthome");
			mv.addObject("msg","Login Failed");
		}
		return mv;
	}
	*/
	
	@PostMapping("/addcounsellor")
	  public String addmentordemo(@ModelAttribute("counsellor") Counsellor counsellor)
	  {
		counsellorService.addcounsellor(counsellor); 
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("counsellorregistration");
	    mv.addObject("msg", "Counsellor Registration Successfully");
	    return "redirect:counsellorlogin";
	  }
	@PostMapping("/newcnslrreg1")
	  public String newcnslrreg1(@ModelAttribute("counsellor") Counsellor counsellor)
	  {
		counsellorService.addcounsellor(counsellor); 
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("newconslrreg");
	    mv.addObject("msg", "Counsellor Registration Successfully");
	    return "redirect:counsellorlogin";
	  }
	
	@PostMapping("/addstudent")
	  public String addstudentdemo(@ModelAttribute("student") Student student)
	  {
		studentService.addstudent(student); 
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("studentregistration");
	    mv.addObject("msg", "Student Registration Successfully");
	    return "redirect:studentlogin";
	  }
	@GetMapping("/counsellorregistration")
	public ModelAndView mentorregdemo()
	{
			 ModelAndView mv = new ModelAndView("counsellorregistration","mentor",new Counsellor());
			 return mv;
	}
	@GetMapping("/newcnslrreg1")
	public ModelAndView newcnslrreg1demo()
	{
			 ModelAndView mv = new ModelAndView("newconslrreg","mentor",new Counsellor());
			 return mv;
	}
	@GetMapping("/studentregistration")
	public ModelAndView studentregdemo()
	{
			 ModelAndView mv = new ModelAndView("studentregistration","student",new Student());
			 return mv;
			
	}
//	@GetMapping("/deleteemp")
//	public String deleteempdemo(@RequestParam("id") int eid)
//	{
//		adminService.deleteemployee(eid);
//		return "redirect:viewallemps";
//	}
	@GetMapping("/viewmen")
	public ModelAndView viewmentordemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("auname");
		
		Counsellor men =  counsellorService.viewcounsellor(euname);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewcounsellor");
		mv.addObject("men", men);
		return mv;
	}
	@GetMapping("/viewcounsellor")
	public ModelAndView viewemployeedemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("cname");
		Counsellor emp =  counsellorService.viewcounsellor(euname);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewcounsellor");
		mv.addObject("emp", emp);
		return mv;
	}
	@GetMapping("/viewstudent")
	public ModelAndView viewstudentdemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("auname");
		
		Student stu =  studentService.viewstudent(euname);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewstudent");
		mv.addObject("stu", stu);
		return mv;
		
	}
	/*@GetMapping("/viewstudent2")
	public ModelAndView viewstudent2demo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("cname");
		Counsellor stu1 =  studentService.viewstudent(euname);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewstudent2");
		mv.addObject("stu1",stu1);
		return mv;
	}*/
	/*@GetMapping("/viewstudent2")
	public ModelAndView viewemployee2demo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("cname");
		Counsellor emp =  counsellorService.viewcounsellor(euname);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewcounsellor");
		mv.addObject("emp", emp);
		return mv;
	}*/
	
	/*@GetMapping("/viewcounsellor")
	public ModelAndView viewcounsellordemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String cuname = (String) session.getAttribute("cuname");
		
		Counsellor emp =  counsellorService.viewcounsellor(cuname);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewcounsellor");
		mv.addObject("emp", emp);
		return mv;
	}*/
	@GetMapping("/viewallcounsellors")
	public ModelAndView viewallempsdemo()
	{
		ModelAndView mv = new ModelAndView("viewallcounsellors");
		List<Counsellor> emplist=adminService.viewallcounsellors();
		mv.addObject("emplist",emplist);
		return mv;
		
	}
	@GetMapping("/viewallstudents")
	public ModelAndView viewallstudentsdemo()
	{
		ModelAndView mv = new ModelAndView("viewallstudents");
		List<Student> emplist=adminService.viewallstudents();
		mv.addObject("emplist",emplist);
		return mv;
	}
	@GetMapping("/echangepwd")
	public ModelAndView echangepwddemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String euname = (String) session.getAttribute("euname");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("empchangepwd");
		mv.addObject("euname", euname);
		return mv;
	}
	
	
//	@GetMapping("/echangepwd")
//	public ModelAndView echangepwddemo(HttpServletRequest request)
//	{
//		HttpSession session = request.getSession();
//		String euname = (String) session.getAttribute("euname");
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("empchangepwd");
//		mv.addObject("euname", euname);
//		return mv;
//	}
//	
//	@PostMapping("/updateemppwd")
//	public ModelAndView updateemppwddemo(HttpServletRequest request)
//	{
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("empchangepwd");
//		HttpSession session = request.getSession();
//		String euname = (String) session.getAttribute("euname");
//		String eoldpwd = request.getParameter("eopwd");
//		String enewpwd = request.getParameter("enpwd");
//		System.out.println(euname+","+eoldpwd+","+enewpwd);
//		
//		int n  = employeeService.changeemployeepassword(eoldpwd, enewpwd, euname);
//		if(n>0)
//		{
//			
//			mv.addObject("msg","Password updated successfully");
//		}
//		else
//		{
//			
//			mv.addObject("msg","Old Password is Incorrect");
//		}
//		return mv;
//	}
//	
//	@GetMapping("/viewempbyid")
//	public ModelAndView viewempbyiddemo(@RequestParam("id") int eid)
//	{
//		Employee emp = adminService.viewemployeebyid(eid);
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("viewempbyid");
//		mv.addObject("emp",emp);
//		return mv;
//	}
	
	@GetMapping("/counsellorslotform")
	public ModelAndView counsellorslotformdemo(){
		ModelAndView mv=new ModelAndView("counselloslotsform");
		return mv;
		
	}
	@PostMapping("/savenewcounsellorslot")
	public String savenewcounsellorslotdemo(@ModelAttribute ("newslot") BookSlots slot){
		
		bookslotsService.savebookslots(slot);
		return "redirect:/adminhome";
		
	}
	@GetMapping("/adminviewslots")
	public ModelAndView adminviewslotsdemo() {
		ModelAndView mv= new ModelAndView();
		List<BookSlots> blist=bookslotsService.viewallBookSlots();
		mv.addObject("slotlist", blist);
		mv.setViewName("adminshowslots");
		return mv;
	}
	
	@GetMapping("/appointmentform")
	public ModelAndView appointmentformdemo(){
		ModelAndView mv=new ModelAndView("appointmentbook");
		
		return mv;
		
	}
	@PostMapping("/saveappointment")
	public String saveappointmentdemo(@ModelAttribute ("newappointment") BookAppointments newappointment){
		
		bookappointmentsService.savebookappointments(newappointment);
		return "redirect:/studenthome";
		
	}
	
	@GetMapping("/adminviewappointments")
	public ModelAndView adminviewappointmentsdemo() {
		ModelAndView mv= new ModelAndView();
		List<BookAppointments> clist=bookappointmentsService.viewallbookappointments();
		mv.addObject("appointmentlist", clist);
		mv.setViewName("adminshowappointments");
		return mv;
	}
	@GetMapping("/studentviewslotsra")
	public ModelAndView studentviewslotsdemo() {
		ModelAndView mv= new ModelAndView();
		List<BookSlots> blist=bookslotsService.viewallBookSlots();
		mv.addObject("slotlist", blist);
		mv.setViewName("studentviewslots");
		return mv;
	}
	
	
	
	
}
