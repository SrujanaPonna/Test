package Pack1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class FClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("signup.insly.com");
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.id("userName")).sendKeys("User1");
		driver.findElement(By.id("usrPwd")).sendKeys("Abc123");
		driver.findElement(By.id("cnfUsrPwd")).sendKeys("Abc123");
		/*Select drpdwn = new Select(driver.findElement(By.tagName("Question")));
		drpdwn.selectByVisibleText("What is your pet name?");*/
		driver.findElement(By.id("firstName")).sendKeys("ABC");
		driver.findElement(By.id("middleName")).sendKeys("DEF");
		driver.findElement(By.id("lastname")).sendKeys("XYZ");
	    driver.findElement(By.xpath("//label[contains(text(),'Select Security Question')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'What is your pet name?')]")).click();
	    driver.findElement(By.id("M")).click();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   
	    
	}

}
