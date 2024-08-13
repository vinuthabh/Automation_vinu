package extent_reports;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToAddScreenshotToReport {

	@Test
	public void addScreenshot() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/extentScreenshotReport.html");
		ExtentReports extRep = new ExtentReports();
		extRep.attachReporter(spark);
		ExtentTest test = extRep.createTest("addScreenshot");
		test.log(Status.PASS, "adding screenshot");
		test.addScreenCaptureFromBase64String(screenshot);
		extRep.flush();
		
	}
}
