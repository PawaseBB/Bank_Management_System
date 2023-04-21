package com.jsp.Controller.Customer;

import com.jsp.Service.CustomerService;

public class DepositeMony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount = 200;
		
				CustomerService customerService = new CustomerService();
				customerService.depositeMoney(1, 4, amount);
	}

}
