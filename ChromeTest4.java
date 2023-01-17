package com_utimateqaBaseUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest4 {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";  //storing baseurl
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");  //setting web driver
        WebDriver driver = new ChromeDriver(); //creating object of web driver
        driver.get(baseUrl);  //method to invoke Url
        driver.manage().window().maximize();   //to maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  //timeout session
        String title = driver.getTitle();  //storing title
        System.out.println("Title of page:"+title);  //print title
        String currentURL = driver.getCurrentUrl(); //storing current Url
        System.out.println("Current url of page:"+title);  //print title
        String pageSource = driver.getPageSource();  //storing page source
        System.out.println("Page source:"+pageSource);  //print pagesource
        WebElement emailField=driver.findElement(By.id("user[email]")); //storing emailfield
        emailField.sendKeys("rpatel@gmail.com");  //sending keys to emailfield
        WebElement passwordField = driver.findElement(By.id("user[password]"));  //storing password field
        passwordField.sendKeys("123456");  //sendkeys to password field

        //driver.close();  //closing browser
    }
}
