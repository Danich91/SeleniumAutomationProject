package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {


	
	public void frameHandling()
	{
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));//search for "iframes" in the page and locate particular frame
		driver.switchTo().frame(iframe);
		WebElement frameclick=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frameclick.click();
		
	}
	
	public static void main(String[] args) {
		
		FrameExample frameexample= new FrameExample();
		frameexample.frameHandling();
		// TODO Auto-generated method stub

	}

}
