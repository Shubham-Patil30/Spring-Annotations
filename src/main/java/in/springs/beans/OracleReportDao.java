package in.springs.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracle")
@Primary
public class OracleReportDao implements ReportDeo {
@Override
public void generateReport() {
	System.out.println("Geting Data from Oracle DB");
	
}
}

