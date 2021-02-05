package com.aura.spring.dao;
/**
 * 持久层，用于数据库的CURD操作
 * @author panghu
 *
 */

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void insertEmp() {
		System.out.println("EmployeeDAOImpl insert sucess!");
	}

}
