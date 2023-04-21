package com.jsp.Controller.Customer;

import com.jsp.Dto.Customer;
import com.jsp.Service.CustomerService;

public class SaveCustomer {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("Shubham");
		customer.setStatus("approved");
		
		CustomerService customerService = new CustomerService();
		customerService.saveCustomer(customer);
	}

}
