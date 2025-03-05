package SeleniumSampleSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	
	public WebDriver driver;
	
	public void browserInitialisation()
	{
		driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
	}

	public void dropdowns()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select=new Select(dropdown);
		//select.selectByVisibleText("JAVA");
		//select.selectByIndex(2);
		select.selectByValue("sql");
	}
	public static void main(String[] args) {
		
		Dropdowns dropdown= new Dropdowns();
		
		dropdown.browserInitialisation();
		dropdown.dropdowns();
	}

}
