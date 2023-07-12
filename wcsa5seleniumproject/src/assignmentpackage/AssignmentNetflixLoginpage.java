package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNetflixLoginpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id*='id_us']")).sendKeys("jayapatil0306@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("123456789");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("//button[contains(text(),'Sign In')]")).click();
		Thread.sleep(2000);
		
		//driver.close();

	}
		 
	} 

