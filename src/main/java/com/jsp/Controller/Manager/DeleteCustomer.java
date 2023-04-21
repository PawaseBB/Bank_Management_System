package com.jsp.Controller.Manager;

import com.jsp.Service.ManagerService;

public class DeleteCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerService managerService = new ManagerService();
		managerService.deleteCustomer(1, 2);
	}

}
