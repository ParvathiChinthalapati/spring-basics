package com.infosys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class ReportService {

	
	//private ReportGenerator generator;

	
	private ReportGenerator reportGenerator;
	
	//private HTMLReportGenerator htmlReportGenerator;

	private int recordCount;

public ReportGenerator getReportGenerator() {
	return reportGenerator;
}



public ReportService(ReportGenerator reportGenerator, int recordCount) {
	super();
	System.out.println("parameterized construtor");
	this.reportGenerator = reportGenerator;
	this.recordCount = recordCount;
}



public ReportService() {
	// TODO Auto-generated constructor stub
}



public void setReportGenerator(ReportGenerator reportGenerator) {
	this.reportGenerator = reportGenerator;
}

public int getRecordCount() {
	return recordCount;
}

public void setRecordCount(int recordCount) {
	this.recordCount = recordCount;
}

public void generateReport() {
    System.out.println(reportGenerator.generateReport(recordCount));
}
}