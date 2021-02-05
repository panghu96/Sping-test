package com.aura.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aura.spring.dao.EmployeeDAO;
import com.aura.spring.handler.EmployeeHandler;
import com.aura.spring.service.EmployeeService;

public class TestSpring {

	@Test
	public void test() {
		// 创建Spring容器对象
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取具体的组件对象
		/* 参数1：spring容器中对象组件的id
		 * 参数2：对应id类.class，可以是接口
		 */
		EmployeeDAO employeeDAO = context.getBean("employeeDao", EmployeeDAO.class);
		System.out.println(employeeDAO);
		EmployeeService employeeService = context.getBean("employeeService",EmployeeService.class);
		System.out.println(employeeService);
		EmployeeHandler employeeHandler = context.getBean("employeeHandler",EmployeeHandler.class);
		System.out.println(employeeHandler);
		employeeHandler.regist();
		
	}

}
