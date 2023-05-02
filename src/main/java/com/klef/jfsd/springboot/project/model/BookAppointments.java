package com.klef.jfsd.springboot.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="available_appointments_table")
public class BookAppointments {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false,length = 200)
	private String Counsellornamename;
	@Column(nullable = false,length = 200)
	private String Studentid;
	@Column(nullable = false,length = 200)
	private String StudentName;
	@Column(nullable = false,length = 200)
	private String Date;
	@Column(nullable = false,length = 200)
	private String Slot;
	@Column(nullable = false,length = 200)
	private String Day;
	@Column(nullable = false,length = 200)
	private String Reason;
	public int getId() {
		return id;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCounsellornamename() {
		return Counsellornamename;
	}
	public void setCounsellornamename(String counsellornamename) {
		Counsellornamename = counsellornamename;
	}
	public String getStudentid() {
		return Studentid;
	}
	public void setStudentid(String studentid) {
		Studentid = studentid;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getSlot() {
		return Slot;
	}
	public void setSlot(String slot) {
		Slot = slot;
	}
	public String getDay() {
		return Day;
	}
	public void setDay(String day) {
		Day = day;
	}
	@Override
	public String toString() {
		return "BookAppointments [id=" + id + ", Counsellorname=" + Counsellornamename + ", Studentid=" + Studentid
				+ ", StudentName=" + StudentName + ", Date=" + Date + ", Slot=" + Slot + ", Day=" + Day + ", Reason="
				+ Reason + "]";
	}
	
	
	
	
}
