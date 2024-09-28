package com.jpaexample.teachers;


import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Teacher_info")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "Teacher_id")
	private long id;
	@Column (name = "Teacher_name")
	private String name;
	@Column (name = "Teacher_age")
	private int age;
	@Column (name = "Teacher_email")
	private String email;
	@Column (name = "Teacher_contact_details")
	private long contact;
	@Column (name = "Teacher_specialization")
    private String specialization;

	public Teacher() {
	}
	
	
	
	public Teacher(long id, String name, int age, String email, long contact, String specialization) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.contact = contact;
		this.specialization = specialization;
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



	public long getContact() {
		return contact;
	}



	public void setContact(long contact) {
		this.contact = contact;
	}



	public String getSpecialization() {
		return specialization;
	}



	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}



	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", contact=" + contact
				+ ", specialization=" + specialization + "]";
	}
	
	
}