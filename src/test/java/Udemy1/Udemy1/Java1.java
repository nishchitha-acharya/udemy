package Udemy1.Udemy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Java1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://meetingtest.sandbox-engagedly.com/");
	    driver.findElement(By.name("user[user_name]")).sendKeys("nischithaacharya123@gmail.com");
	    driver.findElement(By.name("user[password]")).sendKeys("Welcome@123");
	   // driver.findElement(By.className("signin-btn")).click();
	    //driver.findElement(By.cssSelector("button.signin-btn")).click();
	    driver.findElement(By.xpath("//button[@class='signin-btn']")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.getTitle());
	    
	   Assert.assertEquals(driver.getTitle(), "Engagedly - Level Up Your Work Force");

	}

}
