package com.infosys.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infosys.services.ReportService;

public class Client {
	
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 ReportService service = (ReportService) context.getBean("reportService");
		// ReportService service = (ReportService) context.getBean("reportService2",ReportService.class);
		 service.display();
		 context.close();
	}

}
