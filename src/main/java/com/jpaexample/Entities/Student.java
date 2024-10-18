package com.jpaexample.Entities;



import jakarta.persistence.CascadeType;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
@Data
@AllArgsConstructor
@Entity
@Table (name = "student_info")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column (name = "Student_id")
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
	
	 @OneToOne(cascade  = CascadeType.ALL)
	    @JoinColumn(name = "course_id")
	    private Course course;
	

	public Student() {
	}
	
	
	
	public Student(long id, String name, int age, String email, int class_name, long contact, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.class_name = class_name;
		this.contact = contact;
		this.course =course;
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
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", class_name=" + class_name + ", contact=" + contact + ", course=" + course +"]";
	}
	
	
}