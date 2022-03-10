package testDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{
	public static void main(String[] sargs)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Software_Sele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("open google");
		
	}

}
