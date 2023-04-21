package com.jsp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Dto.Admin;
import com.jsp.Dto.Manager;

public class AdminDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bhushan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Admin saveAdmin(Admin admin) {
		entityTransaction.begin();
		entityManager.persist(admin);
		entityTransaction.commit();
		return admin;
	}

	public Admin updateAdmin(Admin admin) {
		Admin a = entityManager.find(Admin.class, admin.getId());
		if(admin.getName() != null) {
			a.setName(admin.getName());
		}
		if(a != null) {
			entityTransaction.begin();
			entityManager.merge(a);
			entityTransaction.commit();
		}
		return admin;
	}
	
	
	public void deleteAdmin(int id) {
		Admin admin = entityManager.find(Admin.class , id);
		if(admin != null) {
			entityTransaction.begin();
			entityManager.remove(admin);
			entityTransaction.commit();
		} 
	}
	
	public List<Manager> approveManager (int id) {
		Admin admin = entityManager.find(Admin.class , id);
		List<Manager> manager = null;
		ManagerDao managerDao = new ManagerDao();
		manager = managerDao.getAllManager(manager);
		for (Manager m : manager) {
			if (m.getStatus().equals("unapproved")) {
				m.setStatus("approved");
				entityTransaction.begin();
				entityManager.merge(m);
				entityTransaction.commit();
			}
		}
		return manager;
	}
	
	
}
