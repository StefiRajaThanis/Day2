package org.seleniumday9questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question12 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement fruitss = driver.findElement(By.id("fruits"));
		Select s = new Select(fruitss);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
		for (int i = 0; i < options.size(); i++) {
			if(i/2==0) {
				System.out.println(options.get(i).getText());
			}
			
		}
			
			
		
	}

}
