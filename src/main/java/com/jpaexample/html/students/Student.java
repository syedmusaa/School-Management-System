package com.jpaexample.html.students;


import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Student_info")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "Student_id")
	private long id;
	@Column (name = "Student_name")
	private String name;
	@Column (name = "Student_age")
	private int age;
	@Column (name = "Student_class")
	private int class_name;
	@Column (name = "Student_email")
	private String email;
	@Column (name = "Student_contact_details")
	private long contact;

	public Student() {
	}
	
	
	
	public Student(long id, String name, int age, String email, int class_name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.class_name = class_name;
		this.contact = contact;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	
	public int getClass_name() {
		return class_name;
	}


	public void setClass_name(int class_name) {
		this.class_name = class_name;
	}
	
	
	
	public long getContact() {
		return contact;
	}



	public void setContact(long contact) {
		this.contact = contact;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", class_name=" + class_name + ", contact=" + contact + "]";
	}
	
	
}