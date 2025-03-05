package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends BaseClass{
	
	public void dragandDropMethod()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragdrop=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(dragdrop).click();
		actions.doubleClick(dragdrop).perform();
		WebElement dragto=driver.findElement(By.id("mydropzone"));
		actions.dragAndDrop(dragdrop, dragto).build().perform();
	}

	public static void main(String[] args) {
		DragandDrop draganddrop= new DragandDrop();
		draganddrop.browserInitialisation();
		draganddrop.dragandDropMethod();
		// TODO Auto-generated method stub

	}

}
