 package com.infosys.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infosys.services.ReportGenerator;
import com.infosys.services.ReportService;

public class Client {
	
	public static void main(String args[]) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 ReportService service = (ReportService) context.getBean("reportService");
		 service.generateReport();
		
	}

}

