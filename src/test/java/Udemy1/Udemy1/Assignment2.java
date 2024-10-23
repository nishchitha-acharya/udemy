package Udemy1.Udemy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

//import junit.framework.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("name")).sendKeys("nish");
		driver.findElement(By.name("email")).sendKeys("nish@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Welcome");
		// exampleCheck1
		driver.findElement(By.id("exampleCheck1")).click();

		Select select = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		select.selectByIndex(1);
		// inlineRadio1
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.id("inlineRadio1")).isSelected();
		driver.findElement(By.name("bday")).click();
		// driver.findElement(By.cssSelector("bday")).click();
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		// driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		// Assert.assertEquals(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText(),
		// "");

		// https://rahulshettyacademy.com/AutomationPractice/

	}

}
