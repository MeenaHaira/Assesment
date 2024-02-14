package com.ollion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {
	
	public static WebDriver driver;
	@Test
	public static void browser(){
		
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Apple\\eclipse-workspace\\ollion\\driver\\chromedriver.exe");
	
	 driver= new ChromeDriver();
	driver.get("https://stackoverflow.com/");
	driver.manage().window().maximize();
	}
	
	@Test
	public void browserSection() {
		
	WebElement browseSection = driver.findElement(By.xpath("(//a[@role='menuitem'])[1]"));
	browseSection.click();
}
	@Test
	public void users() throws InterruptedException{
		WebElement users = driver.findElement(By.xpath("//span[text()='Users']"));
		users.click();
	}
	
	
	@Test
	public void editors() throws Exception{
		System.out.println(driver.findElement(By.xpath("//div[@id='mainbar-full']/h1")).getText());
		Thread.sleep(6000);
		WebElement editor = driver.findElement(By.xpath("//a[contains(text(),'Editors')]"));
		editor.click();
	}
	
	}
