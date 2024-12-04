package org.seleniumday9questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("ArulSarvesh");
		driver.findElement(By.id("password")).sendKeys("3I00U5");
		driver.findElement(By.id("login")).click();
		WebElement location = driver.findElement(By.name("location"));
		String text = location.getText();
		System.out.println(text);
	}
	

}
