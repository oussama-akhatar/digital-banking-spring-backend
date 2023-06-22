package com.example.digitalbankingspringbackend.repositories;

import com.example.digitalbankingspringbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
