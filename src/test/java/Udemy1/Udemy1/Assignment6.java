package Udemy1.Udemy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String checkboxText=driver.findElement(By.xpath("//label[@for='benz']")).getText();
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByVisibleText(checkboxText);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(checkboxText);
		driver.findElement(By.id("alertbtn")).click();
	    String alertText =driver.switchTo().alert().getText();
	    String text[] = alertText.split(",");
	    String text1[] = text[0].split(" ");
	    System.out.println( text1[1]);
	    if (text1[1].equals(checkboxText)) {
	    	System.out.println("test case passed");
	    	
	    }
		
		
		
			
	}

}
