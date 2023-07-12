package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneFrame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	  driver.get("https://www.bluestone.com/");
	//  Thread.sleep(2000);
	  //handle the popup
	  driver.findElement(By.id("denyBtn")).click();
	   Thread.sleep(1000);
	   
	   //handle the frame switch the controls to frame
	   driver.switchTo().frame(5); //handle frame by using index
	   Thread.sleep(1000);
	    driver.findElement(By.xpath("//iframe[@id='fc_widget']")).click();
	    
	     driver.switchTo().defaultContent();
	     
	     Thread.sleep(1000);
	     
	      driver.findElement(By.id("chat-fc-name")).sendKeys("Jaya Patil");
	      driver.findElement(By.id("chat-fc-email")).sendKeys("jayapatil0306@gmail.com");
	      driver.findElement(By.id("chat-fc-phone")).sendKeys("987654321");
	      
	      driver.findElement(By.xpath("//a[@class='fc-button'] ")).click();
	    //a[@class='fc-button']
	    
	
}
}
