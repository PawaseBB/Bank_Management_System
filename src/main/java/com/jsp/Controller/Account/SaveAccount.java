package com.jsp.Controller.Account;

import com.jsp.Dto.Account;
import com.jsp.Service.AccountService;

public class SaveAccount {

	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(20000);
		account.setAcc_no(321395048);
		account.setType("Saving");
		
		AccountService accountService = new AccountService();
		accountService.saveAccount(1, account);
	}

}
