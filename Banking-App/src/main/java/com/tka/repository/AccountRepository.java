package com.tka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
