package SeleniumPrograms;

public class BrowserCommands extends BaseClass{
	
	public void browserCommands()
	{
		String title= driver.getTitle();// getting the title of the page // storing the value to string variable title
		System.out.println(title);
		String url= driver.getCurrentUrl();//getting the url of the page
		System.out.println(url);
	
		String pagesource= driver.getPageSource();// getting page source(html code)
		System.out.println(pagesource);
	}

	public static void main(String[] args) {
		
		BrowserCommands browser= new BrowserCommands();
		browser.browserInitialisation();
		browser.browserCommands();
		// TODO Auto-generated method stub

	}

}
