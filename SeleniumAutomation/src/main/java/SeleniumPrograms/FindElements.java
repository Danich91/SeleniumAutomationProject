package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends BaseClass{

	
	public void multipleCheckBoxClick()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> checkboxclick=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement listcheckbox:checkboxclick)
		{
			listcheckbox.click();
		}
	}
	public static void main(String[] args) {
		
		FindElements findelements=new FindElements();
		findelements.browserInitialisation();
		findelements.multipleCheckBoxClick();
		// TODO Auto-generated method stub

	}

}
