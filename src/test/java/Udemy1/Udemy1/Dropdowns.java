package Udemy1.Udemy1;



import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//driver.manage().timeouts();
		Select select =new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        select.selectByValue("AED");
       // select.selectByIndex(2);
       // select.selectByVisibleText("AED");
       // Thread.sleep(2000);
        String options=  select.getFirstSelectedOption().getText();
        System.out.println(options);
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(3000);
        int i=1;
        while(i<6){
        driver.findElement(By.id("hrefIncAdt")).click();
        i++;
        }
        Thread.sleep(2000);
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        //AssertJUnit.assertEquals(driver.getTitle(), "Engagedly - Level Up Your Work Force");
        
        Thread.sleep(3000);
       
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[text()=' Bengaluru (BLR)']")).click();

        Thread.sleep(2000);

        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        Thread.sleep(3000);
        
        //autosuggest
        Thread.sleep(3000);
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        //li[@class='ui-menu-item']/a
        Thread.sleep(3000);
        //List<WebElement> options1 = driver.findElements(By.xpath("li[@class='ui-menu-item']/a"));
        List<WebElement> options1 =driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        Thread.sleep(3000);
        for(WebElement option: options1)
        {
        	if(option.getText().equalsIgnoreCase("India"))
        			{
        		     option.click();
        		     break;
        		     }
        }
        //
        
      }
	}
	


