package com.jsp.Controller.Customer;

import com.jsp.Dto.Customer;
import com.jsp.Service.CustomerService;

public class UpdateCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setId(3);
		customer.setName("Nitin");
		customer.setStatus("approved");
		
		CustomerService customerService = new CustomerService();
		customerService.updateCustomer(customer);
	}

}
