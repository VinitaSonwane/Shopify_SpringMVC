package com.tka.service;

import com.tka.dto.AccountDto;
import com.tka.entity.Account;


public interface AccountService {
	
 AccountDto createAccount(AccountDto accountDto);
 AccountDto getAccountById(Long id);
 AccountDto deposit(Long id , double amount);
}
