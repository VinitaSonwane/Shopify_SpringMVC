package com.jbk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int rollNo; 
    private String firstName; 
    private String lastName; 
    private String email;
    private String phoneNumber;
    private String dateOfBirth; 
    private String gender; 
    private String address; 
    private String enrollmentDate; 
    private String department; 
    private String className; 
    private String year;
    
    public Student() {
		// TODO Auto-generated constructor stub
	}



	public Student(int rollNo, String firstName, String lastName, String email, String phoneNumber, String dateOfBirth,
			String gender, String address, String enrollmentDate, String department, String className, String year) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.address = address;
		this.enrollmentDate = enrollmentDate;
		this.department = department;
		this.className = className;
		this.year = year;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Student "
				+ "[rollNo=" + rollNo 
				+ ", firstName=" + firstName 
				+ ", lastName=" + lastName 
				+ ", email=" + email
				+ ", phoneNumber=" + phoneNumber 
				+ ", dateOfBirth=" + dateOfBirth 
				+ ", gender=" + gender 
				+ ", address="+ address 
				+ ", enrollmentDate=" + enrollmentDate 
				+ ", department=" + department 
				+ ", className="+ className 
				+ ", year=" + year + "]";
	}
	}



