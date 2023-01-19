package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		Doctor doctor = context.getBean(Doctor.class);
		doctor.assist();
		doctor.setQualification("Pudr");
		System.out.println(doctor);
	}
}