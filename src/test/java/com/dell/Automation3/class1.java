package com.dell.Automation3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

public class class1 {

	@Test
	public void happy() throws Exception {
		
	System.setProperty("Webdriver.chrome.driver","C:\\chrome driver\\chrome-win64\\chrome.exe");	
	ChromeOptions lucky = new ChromeOptions();
	lucky.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.dell.com/en-us");
	
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.id("mh-search-input"));
	search.sendKeys("computer");
	WebElement enter = driver.findElement(By.xpath("//button[@class='mh-search-btn mh-search-submit']"));
	enter.click();
	
	
	//WebElement contactUs = driver.findElement(By.xpath("//*[@id=\"unified-masthead\"]/div[1]/div[2]/div[2]/div/a/span/span"));
	//contactUs.click();
	
	
	
	Thread.sleep(10000);
	driver.close();
		
	}
	
	
	
	
}
