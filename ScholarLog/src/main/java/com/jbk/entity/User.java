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
public class User {

	@Id
	private String firstName; 
    private String lastName; 
    private String username;
    private String password; 
    private String email;
    private String mobile;
    
    

}
