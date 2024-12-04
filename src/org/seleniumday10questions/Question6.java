package org.seleniumday10questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement framework = driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[8]"));
		Actions act = new Actions(driver);
		framework.click();
		Thread.sleep(3000);
		WebElement loginjun = driver.findElement(By.xpath("//a[contains(text(), 'JUNI')]"));
		loginjun.click();
		
		WebElement qstn1 = driver.findElement(By.xpath("//pre[contains(text(),'Enter the username and ')]"));
		String text = qstn1.getText();
		System.out.println(text);
	}

}
