package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multibrowsering2 {
    static String browser = "Chrome";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");  //setting web driver
            driver = new ChromeDriver(); //creating object of web driver
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/driver/msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.out.println("not valid browser ");
        }

        driver.get(baseUrl);  //method to invoke Url
        driver.manage().window().maximize(); //maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String title =driver.getTitle();  //storing title
        System.out.println("Title of the page:"+ title);  //printing title in console
        String url = driver.getCurrentUrl();
        System.out.println("current Url:"+url);
        String pageSource = driver.getPageSource();  //storing page source
        System.out.println("Page source:"+pageSource);  //print pagesource
        WebElement usernameField=driver.findElement(By.name("username")); //storing usernamefield
        usernameField.sendKeys("riddhip");  //sending keys to username field
        WebElement passwordField = driver.findElement(By.name("password"));  //storing password field
        passwordField.sendKeys("12345");  //sendkeys to password field

        driver.close();  //closing browser
    }
}
