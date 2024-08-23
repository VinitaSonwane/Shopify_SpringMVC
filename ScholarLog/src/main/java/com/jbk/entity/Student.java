package com.jbk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
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
    
    
	}



