package org.seleniumday10questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("//h2[contains(text(), 'Selenium Test P')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(), 'DAY 10 TA')]")).click();
		WebElement qstn7 = driver.findElement(By.xpath("//pre[contains(text(), 'QUESTION 7')]"));
		String text = qstn7.getText();
		System.out.println(text);
	}

}
