package com.aura.springmvc.handler;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
 * SpringMVC请求处理器，处理客户端的请求
 */
@Controller
public class SpringMVCHandler {

	/*
	 * RequestMapping(value="") 配置请求与处理方法的映射，value可以省略
	 */
	@RequestMapping(value = "/hello")
	public String testHello() {
		System.out.println("Hello Spring");
		return "success";
	}

	/*
	 * 处理请求参数 形参前加注解 @RequestParam(value="")
	 */

	@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam(value = "username") String username,

			@RequestParam("age") Integer age) {
		System.out.println("username=" + username);
		System.out.println("age=" + age);

		return "success";
	}

	/*
	 * 处理响应  
	 * 方式1：ModelAndView 
	 */
	/*
	 * @RequestMapping("/testResponse") public ModelAndView testResponse() {
	 * ModelAndView mav = new ModelAndView(); // 设置响应数据 mav.addObject("username",
	 * "Tom"); mav.setViewName("success"); return mav; }
	 */
	
	/*
	 * 处理响应
	 * 方式2：map / model
	 */
	@RequestMapping("/testResponse") 
	public String testResponse(/* Map<String,String> map */ Model model) {
		// map.put("username", "Jerry");
		model.addAttribute("username", "Jerry2");
		return "success";
	}

	/*
	 * 重定向
	 */
	@RequestMapping(value="/testRedirect")
	public String testRedirect() {
		/*
		 * /ok.jsp代表WebContent目录下的ok.jsp
		 */
		return "redirect:/ok.jsp";
	}
	
	/*
	 * REST请求方式
	 * 映射格式：请求/{占位符名}
	 * @PathVariable(占位符名) :将url中对应位置的值传递给形参
	 */
	@RequestMapping("testREST/{username}/{age}")
	public String testREST(@PathVariable("username") String username,@PathVariable("age") Integer age) {
		System.out.println("username="+username);
		System.out.println("age="+age);
		return "success";
	}
	
}
