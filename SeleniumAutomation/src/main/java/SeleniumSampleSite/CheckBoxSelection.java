package SeleniumSampleSite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelection {
	
	public WebDriver driver;
	
	public void browserInitialisation()
	{
		driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
	}

	//multiple Check box Selection
	public void multiplecheckboxSelection()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		List<WebElement> checkboxselect=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkbox:checkboxselect)
		{
			checkbox.click();
		}
	}
	
	//radiobutton selection
	
	public void radioButton()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='orange']"));
		radiobutton.click();
	}
	public static void main(String[] args) {
		
		CheckBoxSelection checkboxselection=new CheckBoxSelection();
		checkboxselection.browserInitialisation();
		//checkboxselection.multiplecheckboxSelection();
		checkboxselection.radioButton();
		// TODO Auto-generated method stub

	}

}
