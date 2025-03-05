package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriver driver;// global declaration//WebDriver - interface
	
	public void browserInitialisation()
	{
		driver= new ChromeDriver();//initializing browser //for launching chrome browser
		driver.get("https://selenium.qabible.in/index.php");//get is the method which is in the web driver//url need to pass
		driver.manage().window().maximize();
		System.out.println("Hello");
		//driver= new EdgeDriver();
		//driver=new FirefoxDriver();
	}

	public void quitAndClose()
	{
		
		//driver.close();
		driver.quit();
	}
	public static void main(String[] args) {
		
		BaseClass base=new BaseClass();
		base.browserInitialisation();
	
		//base.quitAndClose();
		
		// TODO Auto-generated method stub

	}

}
