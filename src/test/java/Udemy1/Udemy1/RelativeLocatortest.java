package Udemy1.Udemy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.openqa.selenium.support.locators.RelativeLocator.*;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocatortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name1=driver.findElement(By.name("name"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(name1)).getText());
	
		WebElement dob=driver.findElement(By.xpath("//label[@for='dateofBirth']"));
	driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		
	}

}
