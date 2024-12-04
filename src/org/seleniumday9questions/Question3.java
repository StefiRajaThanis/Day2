package org.seleniumday9questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question3 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement createnew = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		createnew.click();
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("stef");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("sarv");
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("987558657");
		WebElement passw = driver.findElement(By.name("reg_passwd__"));
		passw.sendKeys("stef123");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s = new Select(day);
		s.selectByIndex(21);
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByIndex(11);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(year);
		s2.selectByValue("1992");
		List<WebElement> yearlist = driver.findElements(By.name("birthday_year"));
		for (WebElement webElement : yearlist) {
			System.out.println(webElement.getText()+"\n"+webElement.getAttribute("value"));
			
		}
			
		WebElement female = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		female.click();
		
		List<WebElement> options = s2.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);	
		}
		
			
		}
			
	
	}


