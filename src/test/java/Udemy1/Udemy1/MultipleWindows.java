package Udemy1.Udemy1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		 String parent =it.next();
		 String child =it.next();
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/");
		driver.switchTo().window(parent);
		WebElement element = driver.findElement(By.name("name"));
		File fl=element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl, new File("img.png"));
		
	}

}
