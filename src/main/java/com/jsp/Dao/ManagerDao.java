package com.jsp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Dto.Customer;
import com.jsp.Dto.Manager;

public class ManagerDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bhushan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Manager saveManager(Manager manager) {
		manager.setStatus("unapproved");
		entityTransaction.begin();
		entityManager.persist(manager);
		entityTransaction.commit();
		return manager;
	}
	public Manager updateManager(Manager manager) {
		Manager m = entityManager.find(Manager.class, manager.getId());
		if(manager.getName() != null) {
			m.setName(manager.getName());
		}
		if(m != null) {
			entityTransaction.begin();
			entityManager.merge(m);
			entityTransaction.commit();
		}
		return manager;
	}
	
	public List<Manager> getAllManager(List<Manager> manager) {
		for(Manager m : manager) {
			System.out.println(m.getId());
			System.out.println(m.getName());
			System.out.println(m.getStatus());
		}
		return manager;
	}
	
	public void deleteManager(int id) {
		Manager manager = entityManager.find(Manager.class , id);
		entityTransaction.begin();
		entityManager.remove(manager);
		entityTransaction.commit();
	}
	
	public List<Customer> approveCustomer (int id) {
		Manager manager = entityManager.find(Manager.class , id);
		List<Customer> customer = null;
		CustomerDao customerDao = new CustomerDao();
		customer = customerDao.getAllCustomer(customer);
			for (Customer c : customer) {
				if (c.getStatus().equals("unapproved")) {
					c.setStatus("approved");
					entityTransaction.begin();
					entityManager.merge(c);
					entityTransaction.commit();
				}
			}
		return customer;
	}
	
	public Customer deleteCustomer(int manager_id, int customer_id) {
		Manager manager = entityManager.find(Manager.class , manager_id);
		Customer customer = entityManager.find(Customer.class , customer_id);
		if(manager != null) {
			if(customer != null) {
					entityTransaction.begin();
					entityManager.remove(customer);
					entityTransaction.commit();
			} 
		}
		return customer;
	}
}
