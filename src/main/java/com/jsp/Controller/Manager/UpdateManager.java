package com.jsp.Controller.Manager;

import com.jsp.Dto.Manager;
import com.jsp.Service.ManagerService;

public class UpdateManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		manager.setId(2);
		manager.setName("Suresh");
		
		ManagerService managerService = new ManagerService();
		managerService.updateManager(manager);
	}

}
