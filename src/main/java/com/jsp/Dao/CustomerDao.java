package com.jsp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Dto.Account;
import com.jsp.Dto.Customer;

public class CustomerDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bhushan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Customer saveCustomer(Customer customer) {
		customer.setStatus("unapproved");
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		return customer;
	}
	
	public Customer updateCustomer(Customer customer) {
		Customer c = entityManager.find(Customer.class, customer.getId());
		if(customer.getName() != null) {
			c.setName(customer.getName());
		}
		if(customer.getStatus() != null) {
			c.setStatus(customer.getStatus());
		}
		if(c != null) {
			entityTransaction.begin();
			entityManager.merge(c);
			entityTransaction.commit();
		}
		return customer;
	}
	public Customer getCustomerById(int id) {
		Customer customer = entityManager.find(Customer.class, id);
		if(customer != null) {
			System.out.println();
			System.out.println("Customer Detail");
			System.out.println();
			System.out.println(customer.getId());
			System.out.println(customer.getName());
			System.out.println(customer.getStatus());
		}
		return customer;
	}
	public List<Customer> getAllCustomer(List<Customer> customer) {
		for(Customer c : customer) {
			System.out.println();
			System.out.println("Customer Detail");
			System.out.println();
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getStatus());
		}
		return customer;
	}
	
	public void deleteCustomer(int id) {
		Customer customer = entityManager.find(Customer.class , id);
		entityTransaction.begin();
		entityManager.remove(customer);
		entityTransaction.commit();
	}
	
	public Account depositeMoney(int customer_id, int account_id, double amount) {
		Customer customer = entityManager.find(Customer.class, customer_id);
		Account account = entityManager.find(Account.class , account_id);
		if(customer != null) {
			if(account != null) {
				if(customer.getStatus().equals("approved") && account.getCustomer().getId() == customer_id) {
					account.setBalance(account.getBalance() + amount);
					entityTransaction.begin();
					entityManager.merge(account);
					entityTransaction.commit();
				}
			} else System.out.println(account_id + " is invalid Customer's Account Id");
		} else System.out.println(customer_id + " is invalid Customer Id");
		return account;
	}
	
	public Account transferMoney(int customer_id, int sender, int receiver, double transferAmount) {
		Customer customer = entityManager.find(Customer.class , customer_id);
		Account senderAccount = entityManager.find(Account.class , sender);
		Account receiverAccount = entityManager.find(Account.class , receiver);
		if(customer.getStatus().equals("approved") && senderAccount.getCustomer().getId() == customer_id) {
			if(senderAccount != null && receiverAccount != null) {
				if(senderAccount.getBalance() >= transferAmount) {
					senderAccount.setBalance(senderAccount.getBalance() - transferAmount);
					receiverAccount.setBalance(receiverAccount.getBalance() + transferAmount);
					entityTransaction.begin();
					entityManager.merge(senderAccount);
					entityManager.merge(receiverAccount);
					entityTransaction.commit();
				} else System.out.println("Account balance should be greater than transfer maount");
			} else System.out.println("No such account exists");
		} else System.out.println("You are not approved Customer");
		return receiverAccount;
	}
}
