package selenium.tutorial.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIdentification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		String chromedriverPath="E:\\Training_Automation\\Workspace\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromedriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id='src']")).sendKeys("Bangalore");
		
		driver.findElement(By.linkText("Print/SMS Ticket")).click();
		driver.findElement(By.name("SMSEmail")).click();
		driver.findElement(By.className("search_btn")).submit();
		
	}

}
