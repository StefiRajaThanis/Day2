package org.seleniumday10questions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Employee\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones X");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement phone = driver.findElement(By.xpath("//span[contains(text(), '56GB, Space Gray')]"));
		phone.click();
		//To find window id of current window
		String parentId = driver.getWindowHandle();
		System.out.println("Parent windows id: "+parentId);
		//To find all windows id
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All Windows id: "+allWindowsId);
		
		for (String x : allWindowsId) {
			if(!parentId.equals(x)) {
				driver.switchTo().window(x);
				System.out.println("Child window id: "+x);
			}
			
		}
		driver.findElement(By.xpath("(//span[text()=' Add to Cart '])[1]")).click();
		Thread.sleep(5000);
		//To switch back to the parent window
		driver.switchTo().window(parentId);
	}

}
