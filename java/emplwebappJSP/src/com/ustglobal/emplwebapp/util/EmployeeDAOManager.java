package com.ustglobal.emplwebapp.util;

import com.ustglobal.emplwebapp.dao.EmployeeDAO;
import com.ustglobal.emplwebapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDAOManager {
private EmployeeDAOManager() {}

public static EmployeeDAO getEmployeeDAO() {
	return new EmployeeDaoJdbcImpl();
	
}
}
