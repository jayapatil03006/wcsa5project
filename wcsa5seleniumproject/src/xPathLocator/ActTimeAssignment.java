package xPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActTimeAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://127.0.0.1/login.do;jsessionid=5l410flua4p2r");
		 Thread.sleep(1000);
		 
		  driver.findElement(By.xpath(" //input[@name='username']")).sendKeys("admin");
		 // Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		  // Thread.sleep(2000);
		   
		   
		   driver.findElement(By.xpath("  //a[@class='content users']")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		   //Thread.sleep(2000);
		   
		   //create new user
		   driver.findElement(By.xpath("//input[@name='username'] ")).sendKeys("jayapatil");
		   driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("12345");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("12345");
		   //Thread.sleep(2000);
		   
		driver.findElement(By.xpath("//select[@name='active']")).click(); 
		driver.findElement(By.xpath("//option[@value='false']")).click();
		//Thread.sleep(2000);
		//driver.quit();
		//driver.findElement(By.xpath("//option[@value='true']")).click();
		
		// contact information
		    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("pinki");
		    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9876543210");
		    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("jadhav");
		    driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("123-456-7890");
		    
	}
	


}
