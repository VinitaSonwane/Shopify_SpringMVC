package com.tka.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "account_holder_name")
    private String accountHolderName;
    private Double balance;

    
public Account() {
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Account [id=" + id + ", accountHolderName=" + accountHolderName + ", balance=" + balance + "]";
}


public Account(Long id, String accountHolderName, Double balance) {
	super();
	this.id = id;
	this.accountHolderName = accountHolderName;
	this.balance = balance;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getAccountHolderName() {
	return accountHolderName;
}


public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}


public Double getBalance() {
	return balance;
}


public void setBalance(Double balance) {
	this.balance = balance;
}
   
}
