package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BaseClass{
	
	public void idLocator()
	{
		WebElement messageField= driver.findElement(By.id("single-input-field"));
		WebElement valueAField= driver.findElement(By.id("value-a"));
		WebElement valueBFiled=driver.findElement(By.id("value-b"));
		WebElement buttonField= driver.findElement(By.id("button-one"));
		WebElement yourMessageField=driver.findElement(By.id("message-one"));
	}

	public void nameLocator()
	{
		WebElement nameField= driver.findElement(By.name("viewport"));
		WebElement nameField1= driver.findElement(By.name("author"));
		WebElement nameFiled2=driver.findElement(By.name("keywords"));
		WebElement nameDescription=driver.findElement(By.name("description"));
		
	}
	
	public void classLocator()
	{
		WebElement classField=driver.findElement(By.className("navbar-brand"));
		WebElement listboxField=driver.findElement(By.className("btn moveall btn-outline-secondary"));
	}
	
	public void linkLocator()
	{
		WebElement linkField=driver.findElement(By.linkText("check-box-demo.php"));
		WebElement selectInputFiled= driver.findElement(By.linkText("select-input.php"));
		WebElement formSubmitFiled=driver.findElement(By.linkText("form-submit.php"));//
		WebElement radioButtonField= driver.findElement(By.linkText("radio-button-demo.php"));
		WebElement Select2Field= driver.findElement(By.linkText("jquery-select.php"));
		
		
	}
	
	public void partialLinkLocator()
	{
		WebElement partialLinkFiled=driver.findElement(By.partialLinkText("check-box"));
		WebElement partialSelect2Field= driver.findElement(By.partialLinkText("jquery-sel"));
		WebElement partialSelectInputField= driver.findElement(By.partialLinkText("select-input"));
		WebElement partialFormSubmitField= driver.findElement(By.partialLinkText("form-sub.php"));//
		WebElement partialRadioButoonField= driver.findElement(By.partialLinkText("radio-button"));
	}
	
	
	public void cssSelectorEg()
	{
		/*tag and id
		tag and class
		tag and attribute
		tag,class and attribute*/
		
		//tag#id	
		WebElement tagId= driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement tagIdEg=driver.findElement(By.cssSelector("button#button-one"));
			
		//tag.class
		WebElement tagClass=driver.findElement(By.cssSelector("ul.navbar-nav"));
		
		//tag[attributetype=attributevalue]
		WebElement tagAttributeIDValue= driver.findElement(By.cssSelector("input[id=single-input-field]"));
		WebElement tagAttributeID=driver.findElement(By.cssSelector("input[id=value-a]"));
		
		
		//tag.class[attributetype=attributevalue]
				
		WebElement tagClassAttribute=driver.findElement(By.cssSelector("input.form-control[id=value-a]"));	
	}
	
	public void absoluteXPath()
	{
		WebElement absolXpath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
		WebElement absolXpathEg=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[1]/input"));
		
	}
	
	public void relativeXpath()
	{
		WebElement relaXpath=driver.findElement(By.xpath("//input[@class='form-control']"));
		WebElement relaXpathEg=driver.findElement(By.xpath("//button[@id='button-one']"));
		
	}
	
	public void dynamicXpath()
	{
		WebElement dynamicXpathContainsEg1=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement dynamicXpathContainsEg2=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement dynamicXpathTextEg1=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement dynamicXpathTextEg2=driver.findElement(By.xpath("//div[text()='Your Message : ']"));
		WebElement dynamicXpathIndexEg1=driver.findElement(By.xpath("( //input[@type=\"text\"])[2]"));
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
