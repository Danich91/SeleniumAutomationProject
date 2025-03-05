package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns extends BaseClass{
	
	public void dropdownSelection()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdownselection=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(dropdownselection);
		//select.selectByVisibleText("Red");
		//select.selectByIndex(2);
		select.selectByValue("Green");
		
	}
	
	
	public static void main(String[] args) {
		
		HandlingDropdowns handlingdropdowns=new HandlingDropdowns();
		handlingdropdowns.browserInitialisation();
		handlingdropdowns.dropdownSelection();
		// TODO Auto-generated method stub

	}

}
