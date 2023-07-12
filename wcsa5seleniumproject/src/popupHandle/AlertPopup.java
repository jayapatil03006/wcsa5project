package popupHandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;import methodsOfWebElements.GetTextElements;

public class AlertPopup {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdrier.edgd.driver","./drivers/edgedriver.exe");
	WebDriver driver=new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	  driver.get("file:///C:/Users/Admin/Downloads/alert111.html");
	  
	  driver.findElement(By.xpath("//input[@type='button']")).click();
	   
	  
	  //to handle popup using robot
	 /* Robot robot=new Robot();
	   robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  
	  robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	  
	   */
	  
	  //to handle alert popup using switch to method
	  
	   Alert a2 =driver.switchTo().alert();
	   Thread.sleep(2000);
	 a2.accept();  //for accept the pop up
	    a2.dismiss(); //for dismiss the popup
	    
	   System.out.println(a2.getText());
	   
}
}
