package com.infosys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	
	//private ReportGenerator generator;

	@Autowired
	@Qualifier("pdfReportGenerator")
	private ReportGenerator reportGenerator;
	
	//private HTMLReportGenerator htmlReportGenerator;
	@Value("0")
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

public void generateReport() throws  ArithmeticException  {
	System.out.println("In Report Service generate method");
	 if (recordCount <= 0) {
        // throw new ArithmeticException("No records to update");
		 System.out.println("No records to update");
     }
     String ret = reportGenerator.generateReport(recordCount);
     System.out.println("Value return by report:" + ret);

}
}