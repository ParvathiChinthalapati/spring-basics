package com.infosys.services;

public class PDFReportGenerator implements ReportGenerator {

	@Override
	public String generateReport(int records) {
		// TODO Auto-generated method stub
		return "PDF Report generated with record count "+records;
	}

}
