package com.jsp.Controller.Admin;

import com.jsp.Service.AdminService;

public class DeleteAdmin {

	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		adminService.deleteAdmin(1);
	}

}
