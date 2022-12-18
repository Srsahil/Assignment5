package Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//open the url
		String url =driver.getCurrentUrl(); // get current url of the link
		if(url.endsWith("login")) // verify url end with login
		{
			System.out.println("url ends with login");
		}
		
		if(url.contains("demo")) // verify url contains demo in the link 
		{
			System.out.println("url contains demo");
		}

		String title=driver.getTitle(); // get the title of the page
		if(title.contains("HRM")) // check if the url cintains HRM
		{
			System.out.println("title contains-->HRM");
		}
		Thread.sleep(3000);
		driver.manage().window().fullscreen();//maximize the window 
		
		//Task2  verify logo is present or not
		
		
		// locate the xpath of the logo
WebElement logo =driver.findElement(By.xpath("//*[@class='orangehrm-login-logo']//img[@src='/web/images/ohrm_logo.png']"));
boolean logopresent=logo.isDisplayed();  // check if logo is present 
if(logopresent)
{
	System.out.println("logo is present");
}
else 
{
	System.out.println("logo is not present ");
}
driver.quit();
     
	}
	

	
	

}
