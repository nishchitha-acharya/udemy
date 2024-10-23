package Udemy1.Udemy1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0, 500)");
		    js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		    
		   List<WebElement> elements= driver.findElements(By.xpath("//div/table[@id='product']/tbody/tr/td[4]"));
			//driver.close();
		   int sum =0;
		   for(int i=0 ;i< elements.size(); i++)
		   {
			   System.out.println( Integer.parseInt(elements.get(i).getText()));
			   sum = sum+Integer.parseInt(elements.get(i).getText());
			   System.out.println(sum);
		   }
	}

}
