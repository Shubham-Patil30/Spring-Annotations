package in.springs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.springs.AppConfig;
import in.springs.service.ReportService;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
	ReportService service = ctx.getBean(ReportService.class);
	service.getReport();

	}

}

