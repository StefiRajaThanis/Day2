package org.seleniumday10questions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("iphones 7", Keys.ENTER);
		driver.findElement(By.xpath("(//p[@title='Apple iPhone 7 3D Back Covers By Tweakymod'])[1]")).click();
		String ParentWindowId = driver.getWindowHandle();
		System.out.println("Parent window id: "+ParentWindowId);
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All Windows id: "+allWindowsId);
		for (String x : allWindowsId) {
			if(!ParentWindowId.equals(x)) {
				driver.switchTo().window(x);
				System.out.println("Child window id: "+x);
			}
			
		}
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		Thread.sleep(5000);
		
		WebElement cost = driver.findElement(By.xpath("//div[@class='you-pay']"));
		String cost1 = cost.getAttribute("class");
		System.out.println(cost1);
		
		
			
		}

	}


