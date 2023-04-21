package com.jsp.Service;

import com.jsp.Dao.AdminDao;
import com.jsp.Dto.Admin;

public class AdminService {
	public Admin saveAdmin(Admin admin) {
		AdminDao adminDao = new AdminDao();
		return adminDao.saveAdmin(admin);
	}
	
	public Admin updateAdmin(Admin admin) {
		AdminDao adminDao = new AdminDao();
		return adminDao.updateAdmin(admin);
	}
	
	public void deleteAdmin(int id) {
		AdminDao adminDao = new AdminDao();
		adminDao.deleteAdmin(id);
	}
	
	public void approveManager(int id) {
		AdminDao managerDao = new AdminDao();
		managerDao.approveManager(id);
	}
}
