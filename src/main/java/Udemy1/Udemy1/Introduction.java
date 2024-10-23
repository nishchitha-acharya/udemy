package Udemy1.Udemy1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe" );
	//	WebDriver driver = new ChromeDriver();
		
		//C:\Users\nischitha.dn\Downloads\geckodriver-v0.34.0-win64
		System.setProperty("webdriver.gecko.driver","C:\\Firefoxdriver\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		

	}

}
