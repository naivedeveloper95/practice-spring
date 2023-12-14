package com.satyam.spring.spring_java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//		Dao dao = context.getBean(Dao.class);
		Service service = context.getBean(Service.class);
		System.out.println(service.hashCode());
		service.save();
//		context.close();
		
		Service service1 = context.getBean(Service.class);
		System.out.println(service1.hashCode());
		service1.save();
//		context.close();
		context.close();
	}

}
