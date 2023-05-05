package com.infosys.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public ReportGenerator htmlReportGenerator() {
		return new HTMLReportGenerator();
		
	}
	@Bean
	public ReportGenerator pdfReportGenerator() {
		return new PDFReportGenerator();
		
	}
	@Bean
	public ReportService reportService1() {
		System.out.println("in report service 1");
		ReportService reportService = new ReportService(pdfReportGenerator(),150);
		return reportService;
		
	}
	
	@Bean
	public ReportService reportService2() {
		ReportService reportService = new ReportService();
		System.out.println("in report service 2");
		reportService.setReportGenerator(htmlReportGenerator());
		reportService.setRecordCount(200);
		return reportService;
		
	}

}
