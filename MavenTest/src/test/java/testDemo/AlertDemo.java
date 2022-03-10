package testDemo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo 
{
	
	public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Software_Sele\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

	Alert alt= driver.switchTo().alert();
	String altmsg= driver.switchTo().alert().getText();
	System.out.println("Alert msg is:" +altmsg);
	Thread.sleep(3000);
	alt.accept();
	driver.close();
	}
	
	}

