package com.klef.jfsd.springboot.project.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="available_slots_table")
public class BookSlots {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false,length = 200)
	private String Counsellorname;
	@Column(nullable = false,length = 200)
	private String AvailableSlots;
	@Column(nullable = false,length = 200)
	private String Date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCounsellorname() {
		return Counsellorname;
	}
	public void setCounsellorname(String counsellorname) {
		Counsellorname = counsellorname;
	}
	@Override
	public String toString() {
		return "BookSlots [id=" + id + ", Counsellorname=" + Counsellorname + ", AvailableSlots=" + AvailableSlots
				+ ", Date=" + Date + "]";
	}
	public String getAvailableSlots() {
		return AvailableSlots;
	}
	public void setAvailableSlots(String availableSlots) {
		AvailableSlots = availableSlots;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	

}
