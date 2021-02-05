package com.aura.spring.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aura.spring.service.EmployeeService;

/**
 * 控制层：请求处理器，用于调用业务层的具体业务
 * @author panghu
 *
 */
@Controller("handler")
public class EmployeeHandler {
	@Autowired
	private EmployeeService empService;
	
	public void regist() {
		empService.doRegist();
	}
}
