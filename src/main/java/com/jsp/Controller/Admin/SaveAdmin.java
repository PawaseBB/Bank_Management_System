package com.jsp.Controller.Admin;

import com.jsp.Dto.Admin;
import com.jsp.Service.AdminService;

public class SaveAdmin {

	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setName("Ram");
		
		AdminService adminService = new AdminService();
		adminService.saveAdmin(admin);
	}

}
