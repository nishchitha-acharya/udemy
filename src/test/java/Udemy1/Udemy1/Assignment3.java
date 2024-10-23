package Udemy1.Udemy1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("//label[@class='customradio']//span[text()=' User']")).click();
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
	   
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		Select select= new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		select.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("signin")).click();
		//wait.until(ExpectedConditions.visibilityOfAllElements());
		//Thread.sleep(2000);
		List<WebElement> products =driver.findElements(By.cssSelector("h4.card-title"));
		for(int i=0 ;i< products.size(); i++)
		{
			driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), \" Checkout\")]")));
		driver.findElement(By.xpath("//a[contains(text(), \" Checkout\")]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), \" Checkout\")]")));
		driver.findElement(By.xpath("//button[contains(text(), \" Checkout\")]")).click();		

	}

}
