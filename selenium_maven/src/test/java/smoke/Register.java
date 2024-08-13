package smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Register {
@Test
public void register() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	driver.findElement(By.id("FirstName")).sendKeys("vinutha");
	driver.findElement(By.id("LastName")).sendKeys("BH");
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vinuuthabh1998@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Vinuthabh@98");
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Vinuthabh@98");
	driver.findElement(By.id("register-button")).click();
	
}
}
