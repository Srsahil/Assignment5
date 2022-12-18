package Assignment5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		

	List<WebElement> ele=driver.findElements(By.xpath("//a"));
	HashMap<String,String> map=new HashMap<String,String>();
	int siz=ele.size();
	int c=0;
	for(int i=0;i<siz;i++)
	{
		String opt=ele.get(i).getAttribute("href");
		if(opt.contains("linkedin"))
		{
			System.out.println("linkedin is present ");
			map.put("Linkedin", opt);
			c++;
		}
		if(opt.contains("facebook"))
		{
			System.out.println("facebook is present ");
			map.put("Facebook", opt);
			c++;
		}
		if(opt.contains("twitter"))
		{
			System.out.println("twitter is present ");
			c++;
			map.put("Twitter", opt);
		}
		if(opt.contains("youtube"))
		{
			System.out.println("youtube is present ");
			c++;
			map.put("Youtube", opt);
		}
		if(opt.contains("OrangeHRM, Inc"))
		{
			break;
		}
	}
	System.out.println("Number of social icon is "+c);
	  for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+"-"+m.getValue());    
		   }  
	  driver.quit();

	}

}


































