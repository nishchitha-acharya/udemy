package Udemy1.Udemy1;

import java.time.Duration;
import java.util.Arrays;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazonproduct {

//	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String[] productnames = { "Cucumber", "Beetroot" };	
		Thread.sleep(2000);
		// clickingOnItem(driver, productnames);
		Amazonproduct prd = new Amazonproduct();
		prd.clickingOnItem(driver, productnames);
		// driver.close();
		
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	    driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");	
	    driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
	  //  WebDriverWait wait= new WebDriverWait(driver, 5);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
	    
	    System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		
		
	}
	
	public void clickingOnItem(WebDriver driver, String[] productnames) {
		List al = Arrays.asList(productnames);
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		// System.out.pr
		for (int i = 0; i < product.size(); i++) {
			String[] name = product.get(i).getText().split("-");
			String value1 = name[0].trim();
			// if (name.contains("Cucumber")) {
			// int j=0;
			if (al.contains(value1)) {
				List<WebElement> addtocard = driver.findElements(By.xpath("//div[@class='product-action']/button"));
				addtocard.get(i).click();
//				j++;\\
				// break;
			}

		}
		
	}

}
