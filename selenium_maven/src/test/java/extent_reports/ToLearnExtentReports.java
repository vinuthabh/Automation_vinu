package extent_reports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports {

	@Test
	public void createReport() {
		
		String time = LocalDateTime.now().toString().replace(":", "-");
		
		// creating object for ExtentSparkReporter
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/extentReport"+time+".html");
		
		//creating obj for ExtentReports
		ExtentReports extRep=new ExtentReports();
		
		//attach spark to extentReports
		extRep.attachReporter(spark);
		
		//create obj for ExtentTest
		ExtentTest test = extRep.createTest("createReport");
		
		//call log() and provide status and message
		test.log(Status.INFO, "open browser");
		test.log(Status.PASS, "enter valid credentials");
		test.log(Status.PASS, "click on login button");
		test.log(Status.PASS, "home page displayed");
		
		//call flush()
		extRep.flush();
		
				}
}
