package com.jsp.Service;

import java.util.List;

import com.jsp.Dao.ManagerDao;
import com.jsp.Dto.Customer;
import com.jsp.Dto.Manager;

public class ManagerService {
	public Manager saveManager(Manager manager) {
		ManagerDao managerDao = new ManagerDao();
		return managerDao.saveManager(manager);
	}
	
	public Manager updateManager(Manager manager) {
		ManagerDao managerDao = new ManagerDao();
		return managerDao.updateManager(manager);
	}
	
	public void getAllManager(List<Manager> manager) {
		ManagerDao managerDao = new ManagerDao();
		managerDao.getAllManager(manager);
	}
	
	public void deleteManager(int id) {
		ManagerDao managerDao = new ManagerDao();
		managerDao.deleteManager(id);
	}
	
	public void approveCustomer(int id) {
		ManagerDao managerDao = new ManagerDao();
		managerDao.approveCustomer(id);
	}
	
	public Customer deleteCustomer(int manager_id, int customer_id) {
		ManagerDao managerDao = new ManagerDao();
		return managerDao.deleteCustomer(manager_id, customer_id);
	}
	
}
