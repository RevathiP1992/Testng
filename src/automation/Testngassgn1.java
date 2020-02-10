package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngassgn1 {
	WebDriver driver; 
	@BeforeTest
	public void m1() {
		 System.setProperty("webdriver.chrome.driver", "E:\\automation selinium\\chromedriver.exe");
		 driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
			
	}
		
  @Test(priority=1)
  public void f() {
	//	 System.setProperty("webdriver.chrome.driver", "E:\\automation selinium\\chromedriver.exe");
 //driver=new ChromeDriver();
	//	driver.get("https://www.facebook.com/");
	
	 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("polamarasetty");
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Revathi");
	 
		//driver.get("https://parabank.parasoft.com/parabank/index.htm");
  }
  @AfterTest

  public void login() {
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("10l31a0580");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("polamarasettirevathi@gmail.com");
  }
  @Test(enabled=false)
  public void printtext11()
  {
	 String S= driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']")).getText();
	 System.out.println(S);
  }
  @Test(priority=2)
  public void printtext2()
  {
	 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("polamarasettirevathi@gmail.com");
	
  }
  @Test(priority=3)
	public void m2() {
	  driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("10l31a0580");
	}
}

