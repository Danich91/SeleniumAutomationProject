package SeleniumPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {
	
	public void fileUploading()
	{
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement choosefile=driver.findElement(By.id("file-upload"));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until.
		choosefile.click();
		choosefile.sendKeys("C:\\Users\\Flawless\\OneDrive\\Desktop\\DANI\\Obsqura\\Array.pdf");
	}

	 public void roboClassForFileUpload() throws AWTException
	 {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement choosefile=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		choosefile.click();
		StringSelection select=new StringSelection("C:\\Users\\Flawless\\OneDrive\\Desktop\\DANI\\Obsqura\\Array.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);//copy the path to the clipboard
		Robot robot=new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);//vitual keys- represents control key
		robot.keyPress(KeyEvent.VK_V);//virtual key- key "V"
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	 }
	public static void main(String[] args) throws AWTException {
		
		FileUpload fileupload= new FileUpload();
		//fileupload.fileUploading();
		
		fileupload.roboClassForFileUpload();
		// TODO Auto-generated method stub

	}

}
