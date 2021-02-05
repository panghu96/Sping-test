package com.aura.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aura.spring.dao.EmployeeDAO;

/**
 * 业务层：处理业务，实现各个模块的业务逻辑
 * @author panghu
 *
 */
@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO empDAO;
	
	public void doRegist() {
		empDAO.insertEmp();
	}
}
