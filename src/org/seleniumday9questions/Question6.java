package org.seleniumday9questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		List<WebElement> countries = driver.findElements(By.name("country"));
		
		
		for (int i = 0; i < countries.size(); i++) {
			WebElement webElement = countries.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		
	}

}
