package com.klef.jfsd.springboot.project.model;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Visitor_table")
public class Visitor {
	@Id
		@GeneratedValue
			private int id;
		@Column(nullable=false,length=200)
		private String name;
		@Column(nullable=false,length=200)
		private String gender;
		@Column(nullable=false,length=200)
		private String Address;
		  @Column(nullable = false,length = 200)
		   private String relation;
		@Column(nullable=false,length=200)
		private String Contactno;
		@Column(nullable = false,unique = true,length = 200)
		 	private String username;
		 @Column(nullable = false,length = 200)
		   private String password;


}
