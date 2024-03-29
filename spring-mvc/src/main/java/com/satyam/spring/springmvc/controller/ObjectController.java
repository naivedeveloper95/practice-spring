
package com.satyam.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.satyam.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");

		Employee employee = new Employee();
		employee.setId(1234);
		employee.setName("John");
		employee.setSalary(8000.0);
		modelAndView.addObject("employee", employee);

		return modelAndView;
	}
}
