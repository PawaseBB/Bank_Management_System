package com.jsp.Controller.Customer;

import com.jsp.Dto.Account;
import com.jsp.Service.CustomerService;

public class TransferMony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double transferAmount = 100;
		
		if(transferAmount > 0) {
			CustomerService customerService = new CustomerService();
			Account a = customerService.transferMoney(1, 2, 3, transferAmount);
			if(a != null) {
				System.out.println("Transfer is successful");
			} else System.out.println("Transaction failed");
		} else System.out.println("Please enter valid amount to transfer");
	}

}
