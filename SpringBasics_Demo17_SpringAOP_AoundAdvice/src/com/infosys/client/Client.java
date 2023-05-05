 package com.infosys.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.infosys.services.ReportService;

public class Client {
	
	public static void main(String args[]) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 ReportService service1 = (ReportService) context.getBean("reportService");
		 System.out.println("in main report service 1");
		 try {
			service1.generateReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
//		 ReportService service2 = (ReportService) context.getBean("reportService2");
//		System.out.println("in main report service 2");
//		service2.generateReport();
		 	
	}

}

