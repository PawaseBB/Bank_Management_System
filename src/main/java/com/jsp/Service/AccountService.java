package com.jsp.Service;


import com.jsp.Dao.AccountDao;
import com.jsp.Dto.Account;

public class AccountService {
	public 	Account saveAccount(int customer_id, Account account) {
		AccountDao accountDao = new AccountDao();
		return accountDao.saveAccount(account);
	}
	
	public Account getAccountById(int id){
		AccountDao accountDao = new AccountDao();
		return accountDao.getAccountById(id);
	}
}
