package Pack1;

import java.awt.geom.NoninvertibleTransformException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

import javax.lang.model.type.NullType;

import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

public class SClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Se\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	List<WebElement> li =	driver.findElements(By.tagName("a"));
	System.out.println(li.size());
    ListIterator<WebElement> na = li.listIterator();
    while (na.hasNext()) {	
    System.out.println(na.next().getText()); }
    
		
	}

	}


