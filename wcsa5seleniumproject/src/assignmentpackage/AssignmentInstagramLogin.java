package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentInstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//open the browser
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//username
	 driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("jaya_0306");
	// Thread.sleep(2000);
	 
	 driver.findElement(By.cssSelector("input[name*='pa']")).sendKeys("Jaya$1999");
	 //Thread.sleep(2000);
	 
	 driver.findElement(By.cssSelector("button[class*='_acan _acap _acas _aj1-']")).click();
	 //Thread.sleep(2000);
	// driver
	}

}
