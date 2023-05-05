package com.infosys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("reportService")
public class ReportService {

	
	//private ReportGenerator generator;
	@Autowired
	@Qualifier("pdfReportGenerator")
	private ReportGenerator reportGenerator;
	
	//private HTMLReportGenerator htmlReportGenerator;
@Value("100")
	private int recordCount;

public ReportGenerator getReportGenerator() {
	return reportGenerator;
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