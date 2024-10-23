package Udemy1.Udemy1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size()); 
		WebElement footer=driver.findElement(By.id("gf-BIG"));//limiting scope
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement ColumnDriver=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(ColumnDriver.findElements(By.tagName("a")).size());
		String keysclick =Keys.chord(Keys.CONTROL, Keys.ENTER);
		for(int i=1; i<ColumnDriver.findElements(By.tagName("a")).size(); i++)
		{
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(keysclick);
			
			Thread.sleep(3000);
			
		}
			 Set<String> window= driver.getWindowHandles();
				Iterator <String> it = window.iterator();
				
				while(it.hasNext())
				{
					driver.switchTo().window(it.next());
				    System.out.println(driver.getTitle());
				
				}
	    
}
}