package Udemy1.Udemy1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlinWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//*[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Material')]")).click();
	    Set<String> window= driver.getWindowHandles();
		Iterator <String> it = window.iterator();
	    String ParentId=it.next();
	    String ChildId=it.next();
	    driver.switchTo().window(ChildId);
	    
	    
	   String emailid = driver.findElement(By.xpath("//a[contains(text(), 'mentor@rahulshettyacademy.com')]")).getText();
		
		driver.switchTo().window(ParentId);
		driver.findElement(By.name("username")).sendKeys(emailid);

	}

}
