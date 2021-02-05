package com.aura.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aura.spring.dao.EmployeeDAO;
import com.aura.spring.dao.EmployeeDAOImpl;
import com.aura.spring.handler.EmployeeHandler;
import com.aura.spring.service.EmployeeService;

public class TestSpring {
	@Test
	public void test() {
		// 创建spring容器对象
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取spring容器内的组件对象
		EmployeeDAO dao = ctx.getBean("employeeDAOImpl",EmployeeDAO.class);
		System.out.println(dao);
		EmployeeService service = ctx.getBean("employeeService", EmployeeService.class);
		System.out.println(service);
		EmployeeHandler handler = ctx.getBean("handler", EmployeeHandler.class);
		System.out.println(handler);
		// 调用方法
		handler.regist();
		
	}
}
