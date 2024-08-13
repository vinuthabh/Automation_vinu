package smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void login() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("vinuuthabh1998@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vinuthabh@98");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	//	driver.close();
	}
}
