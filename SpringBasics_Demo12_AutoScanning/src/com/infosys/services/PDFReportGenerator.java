package com.infosys.services;

import org.springframework.stereotype.Component;

@Component("pdfReportGenerator")
public class PDFReportGenerator implements ReportGenerator {


	public String generateReport(int records) {
		// TODO Auto-generated method stub
		return "PDF Report generated with record count "+records;
	}

}
