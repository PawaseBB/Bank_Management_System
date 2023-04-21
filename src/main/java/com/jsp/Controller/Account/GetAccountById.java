package com.jsp.Controller.Account;

import com.jsp.Service.AccountService;

public class GetAccountById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountService accountService = new AccountService();
		accountService.getAccountById(2);
	}

}
