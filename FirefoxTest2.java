package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTest2 {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";  //storing baseurl
        System.setProperty("webdriver.gecko.driver","src/driver/geckodriver.exe");  //setting web driver
        WebDriver driver = new FirefoxDriver(); //creating object of web driver
        driver.get(baseUrl);  //method to invoke Url
        driver.manage().window().maximize();   //to maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  //timeout session
        String title = driver.getTitle();  //storing title
        System.out.println("Title of page:"+title);  //print title
        String currentURL = driver.getCurrentUrl(); //storing current Url
        System.out.println("Current url of page:"+title);  //print title
        String pageSource = driver.getPageSource();  //storing page source
        System.out.println("Page source:"+pageSource);  //print pagesource
        WebElement usernameField=driver.findElement(By.name("username")); //storing usernamefield
        usernameField.sendKeys("riddhip");  //sending keys to username field
        WebElement passwordField = driver.findElement(By.name("password"));  //storing password field
        passwordField.sendKeys("12345");  //sendkeys to password field

        driver.close();  //closing browser
    }
}


