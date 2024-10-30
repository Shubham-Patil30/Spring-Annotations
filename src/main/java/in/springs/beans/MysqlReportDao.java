package in.springs.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysql")

public class MysqlReportDao implements ReportDeo{
@Override
 public void generateReport() {
	System.out.println("Gating Data from Mysql DB");
	
}
}

