package com.jsp.Service;

import java.util.List;

import com.jsp.Dao.CustomerDao;
import com.jsp.Dto.Account;
import com.jsp.Dto.Customer;

public class CustomerService {
	public Customer saveCustomer(Customer customer) {
		CustomerDao customerDao = new CustomerDao();
		return customerDao.saveCustomer(customer);
	}
	
	public Customer updateCustomer(Customer customer) {
		CustomerDao customerDao = new CustomerDao();
		return customerDao.updateCustomer(customer);
	}
	
	public Customer getCustomerById(int id) {
		CustomerDao customerDao = new CustomerDao();
		return customerDao.getCustomerById(id);
	}
	
	public void getAllCustomer(List<Customer> customer) {
		CustomerDao customerDao = new CustomerDao();
		customerDao.getAllCustomer(customer);
	}
	
	public void deleteCustomer(int id) {
		CustomerDao customerDao = new CustomerDao();
		customerDao.deleteCustomer(id);
	}
	
	public Account depositeMoney(int customer_id, int account_id, double amount) {
		CustomerDao customerDao = new CustomerDao();
		return customerDao.depositeMoney(customer_id, account_id, amount);
	}
	
	public Account transferMoney(int customer_id, int sender, int receiver, double transferAmount) {
		CustomerDao customerDao = new CustomerDao();
		return customerDao.transferMoney(customer_id, sender, receiver, transferAmount);
	}
	
}
