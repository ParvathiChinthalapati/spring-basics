package com.infosys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class ReportService {

	
	//private ReportGenerator generator;
	
	private ReportGenerator pdfReportGenerator;
	
	private HTMLReportGenerator htmlReportGenerator;

	private int recordCount;

	public ReportService(int recordCount, ReportGenerator pdfReportGenerator) {
		System.out.println("Parameterized Constructor");
		this.recordCount = recordCount;
		this.pdfReportGenerator = pdfReportGenerator;
	}
	
	public ReportService() {
		System.out.println("Default Constructor");
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		System.out.println("Setter method of record count");
		this.recordCount = recordCount;
	}

//	public ReportGenerator getGenerator() {
//		return generator;
//	}
//
//	public void setGenerator(ReportGenerator generator) {
//		System.out.println("Setter method of ReportGenerator");
//		this.generator = generator;
//	}
	
	  public HTMLReportGenerator getHtmlReportGenerator() {
		return htmlReportGenerator;
	}
		@Autowired
	public void setHtmlReportGenerator(HTMLReportGenerator htmlReportGenerator) {
		this.htmlReportGenerator = htmlReportGenerator;
	}

	public void generateReport() {
	        System.out.println(pdfReportGenerator.generateReport(recordCount));
	    }

	public ReportGenerator getPdfReportGenerator() {
		return pdfReportGenerator;
	}
	@Autowired
	public void setPdfReportGenerator(ReportGenerator pdfReportGenerator) {
		this.pdfReportGenerator = pdfReportGenerator;
	}
}
