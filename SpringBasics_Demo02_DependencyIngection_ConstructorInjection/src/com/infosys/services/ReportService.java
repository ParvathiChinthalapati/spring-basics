package com.infosys.services;

public class ReportService {

	private int recordCount;
	private ReportGenerator generator;
	public ReportService(int recordCount, ReportGenerator generator) {
		System.out.println("Parameterized Constructor");
		this.recordCount = recordCount;
		this.generator = generator;
	}
	
	public ReportService() {
		System.out.println("Default Constructor");
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public ReportGenerator getGenerator() {
		return generator;
	}

	public void setGenerator(ReportGenerator generator) {
		this.generator = generator;
	}
	  public void generateReport() {
	        System.out.println(generator.generateReport(recordCount));
	    }
}
