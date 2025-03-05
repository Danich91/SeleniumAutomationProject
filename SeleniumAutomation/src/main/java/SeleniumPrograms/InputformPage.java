package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputformPage extends BaseClass {
	
	
	public void verifyUsercanEnterMessage()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entermessage=driver.findElement(By.id("single-input-field"));
		System.out.println(entermessage.isEnabled());//verify whether the field is enabled or not
		entermessage.sendKeys("Hello");
		WebElement showmessage=driver.findElement(By.id("button-one"));
		showmessage.click();
	}
	
	/*public void verifyUsercanGettotal()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement valuea=driver.findElement(By.id("value-a"));
		valuea.sendKeys("10");
		WebElement valueb=driver.findElement(By.id("value-b"));
		valueb.sendKeys("2");
		WebElement gettotal=driver.findElement(By.id("button-two"));
		gettotal.click();
	}*/
	
	public void printmsgintextfields()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> msgfield=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement printhello:msgfield)
		{
			printhello.sendKeys("Hello");
		}
	}

	public static void main(String[] args) {
		
		InputformPage inputformpage=new InputformPage();
		inputformpage.browserInitialisation();
		//inputformpage.printmsgintextfields();
		//inputformpage.verifyUsercanGettotal();
		inputformpage.verifyUsercanEnterMessage();
		//inputformpage.quitAndClose();
		// TODO Auto-generated method stub

	}

}
