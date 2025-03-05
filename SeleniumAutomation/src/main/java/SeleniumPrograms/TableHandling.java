package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends BaseClass{
	
	
	public void tableMethod()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement fulltable=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(fulltable.getText());//to print the complete table data

	}

	public void selectParticularRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	    WebElement rowselection=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
	    System.out.println(rowselection.getText());
	   //WebElement thirdrowselection=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
	   //System.out.println(thirdrowselection.getText());
	}
	
	public void selectdata()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement dataselection= driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[3]"));
		System.out.println(dataselection.getText());
		//WebElement thirdrowdataselection=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[3]"));
		//System.out.println(thirdrowdataselection.getText());
	}
	
	public void selectColumnData()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> columndata=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement element:columndata)
		{
			System.out.println(element.getText());
		}
	}
	
	public void elementTobeSearch()// to check whether the input given is there in the table or not
	{
		/*String input="Tokyo";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> columndata=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement element:columndata)
		{
			if (element.getText().equals(input))
			{
				System.out.println(element.getText());
			}
		}
	}*/
	
	  String input="Junior Technical Author";
	  driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	  List<WebElement> columndata=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
	  for(WebElement element:columndata)
	  {
		  if (element.getText().equals(input))
		  {
			  System.out.println(element.getText());
		  }
		  
	  }
	 
	}
	 
	 
	public static void main(String[] args) {
		
		TableHandling tablehandling= new TableHandling();
		tablehandling.browserInitialisation();
		//tablehandling.tableMethod();
		System.out.println("***********************");
		//tablehandling.selectParticularRow();
		
		//tablehandling.selectdata();
		
		//tablehandling.selectColumnData();
	
		tablehandling.elementTobeSearch();
		
		
		// TODO Auto-generated method stub

	}

}
