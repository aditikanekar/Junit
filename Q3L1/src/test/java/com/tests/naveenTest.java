package com.tests;



import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class naveenTest {
	WebDriver driver;
	 
    //LoginPage loginPage;
 
	By myAccountButton= By.xpath("(//*[text()=\"My Account\"])[1]");
	
	By registerButton=By.xpath("(//*[text()=\"Register\"])[1]");
	
	By loginButton=By.xpath("(//*[text()=\"Login\"])[1]");
	
	By emailTextbox=By.xpath("//*[@name=\"email\"]");
	
	By password=By.xpath("//*[@name=\"password\"]");
	
	By components=By.xpath("//*[text()=\"Components\"]");
	
	By monitors=By.xpath("//*[contains(text(),\"Monitors\")]");
	
	By products=By.xpath("//*[contains(text(),\"Apple\")]");
	
	By addToCartFirstPr=By.xpath("(//*[contains(text(),\"Add to Cart\")])[1]");
	
	By loginButtonn=By.xpath("//input[@type=\"submit\"]");
	
	By radioButton=By.xpath("(//input[@type=\"radio\"])[6]");
	
	By checkbox=By.xpath("(//input[@type=\"checkbox\"])[1]");
	
	By selectOption=By.id("input-option217");
	
	By textArea=By.id("input-option209");
 
   // @DisplayName("First Test")
    @Test
    public void firstTest() {
    	 WebDriverManager.chromedriver().setup();
         ChromeOptions chromeOptions = new ChromeOptions();
         driver = new ChromeDriver(chromeOptions);
         driver.manage().window().maximize();
         driver.get("https://naveenautomationlabs.com/opencart");
  
        //clicking account button
        driver.findElement(myAccountButton).click();
        //clicking login button
        driver.findElement(loginButton).click();
        //verify register and login button
        
        //Assert.assertTrue(driver.findElement(registerButton).isDisplayed());
      //  Assert.assertTrue(driver.findElement(loginButton).isDisplayed());
         //enter email and password
        driver.findElement(emailTextbox).sendKeys("kanekaraditi@gmail.com");
        driver.findElement(password).sendKeys("Tiger@28");
        //click on login
        driver.findElement(loginButtonn);
        
        //click on monitors under components
        
        driver.findElement(components).click();
        driver.findElement(monitors).click();
        
        //verify products
        Assert.assertTrue(!driver.findElements(products).isEmpty());
        
        //add apple cinema product
        driver.findElement(addToCartFirstPr).click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
    	WebElement rad = driver.findElement(By.xpath("(//input[@type=\"radio\"])[6]"));
    	js.executeScript("arguments[0].scrollIntoView(true);", rad);
    	
        driver.findElement(radioButton).click();
        driver.findElement(checkbox).click();
        
        driver.findElement(textArea).sendKeys("text");
        
        Select objSelect = new Select((WebElement) By.id("input-option217"));
        
        objSelect.selectByIndex(1);
        
        //add to cart
        driver.findElement(addToCartFirstPr).click();
        
        driver.close();
    }
 
 
 
}
