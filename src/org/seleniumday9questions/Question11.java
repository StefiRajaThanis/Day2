package org.seleniumday9questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("ArulSarvesh");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("3I00U5");
		driver.findElement(By.id("login")).click();
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		String text = adultroom.getText();
		System.out.println(text);
	}

}
