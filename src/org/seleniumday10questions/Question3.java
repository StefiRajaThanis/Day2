package org.seleniumday10questions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		driver.findElement(By.xpath("//input[@class='SearchBox__input']")).sendKeys("ceiling fan", Keys.ENTER);
		WebElement fan1 = driver.findElement(By.xpath("//span[contains(text(),'Hugger 52 in. ']"));
		fan1.click();
	}

}
