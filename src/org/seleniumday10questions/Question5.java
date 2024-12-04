package org.seleniumday10questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		
		Actions act = new Actions(driver);
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		act.moveToElement(courses).build().perform();
		WebElement python = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
		python.click();
		Thread.sleep(8000);
		WebElement curriculam = driver.findElement(By.xpath("//h2[contains(text(), 'Curriculum')]"));
		act.contextClick(curriculam).build().perform();
	
		
	}

}
