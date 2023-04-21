package com.jsp.Controller.Manager;

import com.jsp.Dto.Manager;
import com.jsp.Service.ManagerService;

public class SaveManager {

	public static void main(String[] args) {
		Manager manager= new Manager();
		manager.setName("Dakshta");
		manager.setStatus("approved");
		
		ManagerService managerService = new ManagerService();
		managerService.saveManager(manager);
	}

}

