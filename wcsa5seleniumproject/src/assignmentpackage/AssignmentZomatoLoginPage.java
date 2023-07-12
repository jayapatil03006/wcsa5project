package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentZomatoLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
	
		 driver.findElement(By.linkText("Sign up")).click();
	
		 Thread.sleep(2000);
		 driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("jayapatil");
		 Thread.sleep(2000);
		 driver.findElement( By.cssSelector("input[class*='sc-1']")).sendKeys("jayapatil@gmail.com");
		 Thread.sleep(2000);
		 
	driver.close();
	
	}
}
