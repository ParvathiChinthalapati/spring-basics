package com.infosys.services;

import org.springframework.stereotype.Component;

@Component("htmlReportGenerator")
public class HTMLReportGenerator implements ReportGenerator{

	public String generateReport(int records) {
		// TODO Auto-generated method stub
		return "Generated HTML report with record count "+records;
	}

}
