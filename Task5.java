package Assignment5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		

	List<WebElement> ele=driver.findElements(By.xpath("//a"));
	int siz=ele.size();
	int c=0;
	for(int i=0;i<siz;i++)
	{
		String opt=ele.get(i).getAttribute("href");
		if(opt.contains("linkedin"))
		{
			System.out.println("linkedin is present ");
			c++;
		}
		if(opt.contains("facebook"))
		{
			System.out.println("facebook is present ");
			c++;
		}
		if(opt.contains("twitter"))
		{
			System.out.println("twitter is present ");
			c++;
		}
		if(opt.contains("youtube"))
		{
			System.out.println("youtube is present ");
			c++;
		}
		if(opt.contains("OrangeHRM, Inc"))
		{
			break;
		}
	}
	System.out.println("Number of social icon is "+c);
	//verify if any url contains youtube then break
	for(int i=0;i<siz;i++)
	{
		String opt=ele.get(i).getAttribute("href");
		if(opt.contains("youtube"))
		{
			System.out.println("youtube is present ");
			break;
			
		}
	}
	driver.quit();
	}
}
	
	
	

	


