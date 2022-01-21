package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table (name="student")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@NotBlank(message="This field is required")
	@Pattern(regexp = "^[a-zA-Z]*$", message="Can't accept number or symbol")
	@Size(max=15,message="Length must be less than or equal to 15")
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank(message="This field is required")
	@Pattern(regexp = "^[a-zA-Z]*$", message="Can't accept number or symbol")
	@Size(max=15,message="Length must be less than or equal to 15")
	@Column(name="last_name")
	private String lastName;
	
	
	  
	  @DateTimeFormat(pattern = "dd-MM-yyyy")
	  @NotNull(message = "This field is required.")	  
	  @Column(name="date_of_birth")	  
	  @Temporal(TemporalType.DATE) 
	  private Date dob;
	 
	
	
	@NotBlank(message="This field is required")
	@Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message="Incorrect email format")
	@Column(name="email")
	private String email;
	
	
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + DateUtil.formatDate(dob) + ", email="
				+ email + "]";
	}

	
	
	
	
	
	
	
	
}
	