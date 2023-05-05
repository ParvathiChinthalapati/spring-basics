package com.infosys.services;

public class ReportService {

	private int recordCount;
	//private ReportGenerator generator;
	
	private ReportGenerator htmlReportGenerator;
	private ReportGenerator pdfReportGenerator;
	
//	public ReportService(int recordCount, ReportGenerator generator) {
//		System.out.println("Parameterized Constructor");
//		this.recordCount = recordCount;
//		this.generator = generator;
//	}
	
	
	public ReportService() {
		System.out.println("Default Constructor");
	}

	public int getRecordCount() {
		return recordCount;
	}

	public ReportGenerator getHtmlReportGenerator() {
		return htmlReportGenerator;
	}

	public void setHtmlReportGenerator(ReportGenerator htmlReportGenerator) {
		this.htmlReportGenerator = htmlReportGenerator;
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
	
	  public void generateReport() {
	        System.out.println(htmlReportGenerator.generateReport(recordCount));
	    }

	public ReportGenerator getPdfReportGenerator() {
		return pdfReportGenerator;
	}

	public void setPdfReportGenerator(ReportGenerator pdfReportGenerator) {
		this.pdfReportGenerator = pdfReportGenerator;
	}
}
