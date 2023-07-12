/* 
flipkeywordDriFrame then we go to the

 Second Step
  Using 3 browser
 and creating property file  
 using implements method(openBrowser(), closeBrowser())
*/

package pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends   FlibKeyWordDriFrame implements IautoConstant {
	
	static WebDriver driver;
	
	public void openBrowser() throws IOException 
	{
		FlibKeyWordDriFrame flib = new FlibKeyWordDriFrame();
		String browserValue = flib.readPropertyData(PROP_PATH,"Browser");
		String url = flib.readPropertyData(PROP_PATH,"Url");


		if (browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_PATH);
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);
		}
		else if (browserValue.equalsIgnoreCase("Edge"))
		{
			System.setProperty(EDGE_KEY,EDGE_PATH);
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);
		}


		else if (browserValue.equalsIgnoreCase("FireFox"))
		{
			System.setProperty(GECKO_KEY,GECKO_PATH);
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);
		}
	}
	public void closeBrowser()
	{
		driver.quit();
	}

}



