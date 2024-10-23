package Udemy1.Udemy1;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import junit.framework.Assert;

public class SortingTest {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//th[@role ='columnheader'][1]")).click();
		List<WebElement> element =driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> original =element.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> news = original.stream().sorted().collect(Collectors.toList());
		System.out.println(original);
		System.out.println(news);
	//	Assert.assertEquals(news, original);
		List<String> price;
		do {
			List<WebElement> element1 =driver.findElements(By.xpath("//tr/td[1]"));
		price =element1.stream().filter(s -> s.getText().contains("Pineapple")).map(s -> getPrice(s)).collect(Collectors.toList());
		System.out.println(price);
		//price.forEach(a->System.out.println(a));
		
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(price.size()<1);
	}
      private static String getPrice(WebElement s) {
	      String value=      s.findElement(By.xpath("//tr/td/following-sibling::td[1]")).getText();
			  return value;
	   
   }
}
