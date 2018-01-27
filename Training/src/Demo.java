import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("Selenium Training");
		
		
		String chromedriverPath="E:\\Training_Automation\\Workspace\\drivers\\chromedriver.exe";
		String ffdriverPath="E:\\Training_Automation\\Workspace\\drivers\\geckodriver.exe";
		String iedriverPath="E:\\Training_Automation\\Workspace\\drivers\\IEDriverServer.exe";
	
		
		//**********Browser:Firefox************
		/*System.setProperty("webdriver.gecko.driver",ffdriverPath);
		WebDriver driver = new FirefoxDriver();*/
		
		//**********Browser:Chrome************
		System.setProperty("webdriver.chrome.driver",chromedriverPath);
		WebDriver driver = new ChromeDriver();
		
		//**********Browser:IE************
		/*System.setProperty("webdriver.ie.driver",iedriverPath);
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(dc);
		WebDriver driver = new InternetExplorerDriver();*/
		
		//**********Launch Url************
		driver.get("http://www.google.com");
		
		//**********Maximize The Window************
		driver.manage().window().maximize();
		
		//**********Title Verification************
		String pageTitle = driver.getTitle();
		if(pageTitle.equals("Google")){
			System.out.println("Title Matched");
		}else{
			System.out.println("Title Did Not Match");
		}
		
		//**********Enter Search Item************
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		
		//**********Take Screenshot************
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // Copy Screenshot to Another Folder
		FileUtils.copyFile(src, new File("E:\\Training_Automation\\Workspace\\screenshot\\error.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
		
		
		
		//driver.quit();
		
	}

}
