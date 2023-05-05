 package com.infosys.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.infosys.services.AppConfig;
import com.infosys.services.ReportService;

public class Client {
	
	public static void main(String args[]) {
		 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 ReportService service1 = (ReportService) context.getBean("reportService1");
		 System.out.println("in main report service 1");
		 try {
			service1.generateReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		 ReportService service2 = (ReportService) context.getBean("reportService2");
//		System.out.println("in main report service 2");
//		service2.generateReport();
		 	
	}

}

