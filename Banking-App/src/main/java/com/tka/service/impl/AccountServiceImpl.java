package com.tka.service.impl;

import org.springframework.stereotype.Service;

import com.tka.dto.AccountDto;
import com.tka.entity.Account;
import com.tka.mapper.AccountMapper;
import com.tka.repository.AccountRepository;
import com.tka.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
private AccountRepository accountRepository;


public AccountServiceImpl(AccountRepository accountRepository) {
	this.accountRepository = accountRepository;
}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {  //conversion logic 
		Account account = AccountMapper.mapToAccount(accountDto);
		Account saveAccount = accountRepository.save(account);
		return AccountMapper.mapToAccountDto(saveAccount);
	}
	
	@Override
	public AccountDto getAccountById(Long id) {
		Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account does not exist"));
		
		return AccountMapper.mapToAccountDto(account);
		
	}

	@Override
	public AccountDto deposit(Long id, double amount) {
		Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account does not exist"));
		double total = account.getBalance() + amount;
		account.setBalance(total);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

}
