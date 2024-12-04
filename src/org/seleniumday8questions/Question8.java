package org.seleniumday8questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='https://infinity.icicibank.com/corp/L001/consumer/Login_Revamp/Login_NLI_Page.html?default=banner.gif|RCCEMI']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.id("user-id-goahead"));
		findElement.click();
		WebElement userid = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		userid.sendKeys("stefi@gmail.com");
	}

}
