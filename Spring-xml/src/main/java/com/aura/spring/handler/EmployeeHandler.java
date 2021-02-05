package com.aura.spring.handler;
/**
 * 控制层：请求处理器，调用业务层的具体业务
 * @author panghu
 *
 */

import com.aura.spring.service.EmployeeService;

public class EmployeeHandler {
	private EmployeeService employeeService;

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	public void regist() {
		employeeService.doRegist();
	}
}
