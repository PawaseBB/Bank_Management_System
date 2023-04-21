package com.jsp.Controller.Admin;

import com.jsp.Dto.Admin;
import com.jsp.Service.AdminService;

public class UpdateAdmin {

	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setId(1);
		admin.setName("Devid");
		AdminService adminService = new AdminService();
		adminService.updateAdmin(admin);
	}

}
