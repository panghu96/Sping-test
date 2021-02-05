package com.aura.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * 持久层：数据库的CURD操作
 * @author panghu
 *
 */
/*
 * @Repository是代表持久层的注解，相当于xml配置方式中的
 * <bean id="employeeDAOImpl" class="com.aura.spring.dao.EmployeeDAOImpl"></bean>
 * 
 * 默认情况下，注解的id是类名首字母小写。即id=employeeDAOImpl对应EmployeeDAOImpl类
 * 注解的id可以通过@注解名(value="xxx")来手动指定，其中value也可省略
 * 如：@Repository(value="emp")或者@Repository("emp")
 * 
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public void insertEmp() {
		System.out.println("EmployeeDAOImpl insert success!");
	}

}
