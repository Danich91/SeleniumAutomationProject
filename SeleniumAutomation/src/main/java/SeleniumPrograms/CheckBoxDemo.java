package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxDemo extends BaseClass {
	
	public void checkBoxDemoClick()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement clickcheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		
		clickcheckbox.click();
		System.out.println(clickcheckbox.isSelected());//to check whether the check box is selected or not.
	}

	public void radioButtonClick()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobuttonclick=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radiobuttonclick.click();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxDemo checkboxdemo=new CheckBoxDemo();
		checkboxdemo.browserInitialisation();
		checkboxdemo.checkBoxDemoClick();
		//checkboxdemo.radioButtonClick();
		
	}

}
