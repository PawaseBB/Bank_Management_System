package com.jsp.Controller.Customer;

import com.jsp.Service.CustomerService;

public class GetCustomerById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService customerService = new CustomerService();
		customerService.getCustomerById(1);
	}

}
