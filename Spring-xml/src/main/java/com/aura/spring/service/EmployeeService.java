package com.aura.spring.service;
/**
 * 业务层：用于处理业务，实现各个模块间的业务逻辑。
 * @author panghu
 *
 */

import com.aura.spring.dao.EmployeeDAO;

public class EmployeeService {
	private EmployeeDAO employeeDao;

	public EmployeeDAO getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void doRegist() {
		employeeDao.insertEmp();
	}
}
