package com.jsp.Controller.Manager;

import com.jsp.Service.ManagerService;

public class ApprovedCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ManagerService managerService = new ManagerService();
		managerService.approveCustomer(3);
	}

}
