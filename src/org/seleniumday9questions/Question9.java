package org.seleniumday9questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question9 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("ArulSarvesh");
		driver.findElement(By.id("password")).sendKeys("3I00U5");
		driver.findElement(By.id("login")).click();
		WebElement location = driver.findElement(By.name("location"));
		Select s = new Select(location);
		s.selectByIndex(1);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Creek");
		WebElement roomtype = driver.findElement(By.name("room_type"));
		String text = roomtype.getText();
		System.out.println(text);
	}

}
