
package com.satyam.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.satyam.spring.springmvc.dto.Employee;

@Controller
public class listController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("John");
		employee1.setSalary(8000.0);

		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Igor");
		employee2.setSalary(9000.0);

		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("Chris");
		employee3.setSalary(11000.0);

		Employee employee4 = new Employee();
		employee4.setId(4);
		employee4.setName("David");
		employee4.setSalary(699.0);

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);

		modelAndView.addObject("employees", list);

		return modelAndView;
	}
}
