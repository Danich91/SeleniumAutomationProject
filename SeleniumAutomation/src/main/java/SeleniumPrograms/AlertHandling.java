package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends BaseClass {
	
	public void Acceptalert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement buttonclick=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		buttonclick.click();
		driver.switchTo().alert().accept();
	}
	
	public void okCancelAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement buttonclick2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		buttonclick2.click();
		System.out.println(buttonclick2.isDisplayed());
		driver.switchTo().alert().dismiss();
	}
	
	public void msgPassingAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement buttonclick3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		buttonclick3.click();
		driver.switchTo().alert().sendKeys("Dani");
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.browserInitialisation();
		//alerthandling.Acceptalert();
		//alerthandling.okCancelAlert();
		alerthandling.msgPassingAlert();
		
		// TODO Auto-generated method stub

	}

}
