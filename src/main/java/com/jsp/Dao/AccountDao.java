package com.jsp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Dto.Account;

public class AccountDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bhushan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Account saveAccount(Account account) {
		account.setBalance(5000);
		entityTransaction.begin();
		entityManager.persist(account);
		entityTransaction.commit();
		return account;
	}
	public Account updateAccount(Account account) {
		Account a = entityManager.find(Account.class, account.getId());
		if(account.getAcc_no() != 0.0) {
			a.setAcc_no(account.getAcc_no());
		}
		if(account.getBalance() != 0.0) {
			a.setBalance(account.getBalance());
		}
		if (a != null) {
			entityTransaction.begin();
			entityManager.merge(a);
			entityTransaction.commit();
		}
		return account;
	}
	public Account getAccountById(int id) {
		Account account = entityManager.find(Account.class , id);
		if(account != null) {
			System.out.println();
			System.out.println("Account Detail");
			System.out.println();
			System.out.println(account.getId());
			System.out.println(account.getAcc_no());
			System.out.println(account.getBalance());
		}
		return account;
	}
	public List<Account> getAllAccount(List<Account> account) {
		for(Account a : account) {
			System.out.println();
			System.out.println("Account Detail");
			System.out.println();
			System.out.println(a.getId());
			System.out.println(a.getAcc_no());
			System.out.println(a.getBalance());
		}
		return account;
	}
	
}
