package Facebook3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Facebooklogin {

WebDriver driver;
	
	
	@BeforeMethod	
	
	public void Initialization() {
		
	
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\JACKSON\\eclipse-workspace\\ERP10\\resourses\\Browser\\geckodriver.exe");		
	driver=new FirefoxDriver();
	//driver.navigate().to(http://demo.automationtesting.in/Windows.html);
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	


	driver.get("https://en-gb.facebook.com/login/");
	
	}
	
	@Test(priority=0)
	
	public void userlogin() {
		
		//*[@id="email"]
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("balrajullagaddi@yahoo.com");
		
		//*[@id="pass"]
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("balraj06");
		
		//*[@id="loginbutton"]
		
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
		//driver.close();
		
		
		
	}
	
	
	  @Test(priority=1)
	  
	  public void Gettitle() {
		  
		//*[@id="forgot-password-link"]
		  
		  String Title = driver.getTitle();
		  
		  System.out.println(Title);
		  
		 // driver.close();  
		  
	  }

	
@Test(priority=2)
	  
	  public void createnewaccount() {
	
	    String Actualtext = "(47) Facebook";
	
		 
		
		Assert.assertEquals(driver.getTitle(), Actualtext);
		
	     //Assert.assertAll();
		  
	  }
	
@AfterMethod

public void teardown() {
	
	
	driver.close();
}


}
