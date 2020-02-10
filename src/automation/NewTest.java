package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver; 
	@BeforeTest
	public void m1() {
		System.out.println("Before Test");
	}
  @Test(priority=1)
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "E:\\automation selinium\\chromedriver.exe");
	 driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
  }
  @Test(priority=3)
  public void login() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("usrid");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pswrd");
  }
  @Test(enabled=false)
  public void printtext()
  {
	 String S= driver.findElement(By.xpath("//li[text()='ATM Services']")).getText();
	 System.out.println(S);
  }
  @Test(priority=2)
  public void printtext2()
  {
	 String S= driver.findElement(By.xpath("//li[text()='Solutions']")).getText();
	 System.out.println(S);
  }
  @AfterTest
	public void m2() {
		System.out.println("After Test");
	}
}
