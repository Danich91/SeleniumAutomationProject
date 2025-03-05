package SeleniumPrograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplewindowHandling {
	
	public WebDriver driver;
	
	public void browserInitialization()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contactus= driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		WebElement login= driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> multiplewindow= driver.getWindowHandles();
		String title="";
		for(String childwindows:multiplewindow)
		{
			if (!childwindows.equals(parent))
			{
		     System.out.println("Child Windows: " + childwindows);
		     driver.switchTo().window(childwindows);
		     //System.out.println(driver.getTitle());
		     title=driver.getTitle();
			}
			
			if(title.equals("WebDriver | Login Portal"))
			{
				WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
				username.sendKeys("Danij");
	         }
			if(title.equals("WebDriver | Contact Us"))
			{
				WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
				firstname.sendKeys("Dani");
			}
	}
	}
	public static void main(String[] args) {
		
		MultiplewindowHandling multiplewindowhandling= new MultiplewindowHandling();
		multiplewindowhandling.browserInitialization();
		// TODO Auto-generated method stub

	}

}
