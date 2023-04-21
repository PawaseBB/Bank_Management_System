package com.jsp.Controller.Admin;

import com.jsp.Service.AdminService;

public class ApprovedManager {

	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		adminService.approveManager(2);
	}

}
