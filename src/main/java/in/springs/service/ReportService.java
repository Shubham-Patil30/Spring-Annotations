package in.springs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.springs.beans.ReportDeo;

@Service
public class ReportService {
	
	 private ReportDeo report; 

	 public void setReport(ReportDeo report) {
		 System.out.println("Setter Injection ");
		 this.report = report;
	 }
	 
	 @Autowired
	 public ReportService(ReportDeo report) {
		 this.report=report; 
		 System.out.println("ReportService :: Constructor ");
	 }
	 
	 public void getReport() {
		 report.generateReport();
		 System.out.println("Generating Report");
	 }
}
