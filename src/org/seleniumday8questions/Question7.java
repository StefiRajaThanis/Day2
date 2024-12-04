package org.seleniumday8questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='RSNBLogin.html?v=12']"));
		driver.switchTo().frame(frame1);
		WebElement loginid = driver.findElement(By.name("//input[@class='form-control text-muted']"));
		loginid.sendKeys("Stefi@gmail.com");
		WebElement login = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		login.click();
		Thread.sleep(3000);
		WebElement loginpageframe = driver.findElement(By.xpath("//frame[@src='RSNBLogin.html?v=12']"));
		driver.switchTo().frame(loginpageframe);
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.name("fldPassword"));
		password.sendKeys("hpp5620QR");
		WebElement loginfinal = driver.findElement(By.xpath("//a[@ondblclick='return fLogon()']"));
		loginfinal.click();
	}

}
