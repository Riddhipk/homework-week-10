package comOrangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest1 {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";  //storing baseurl
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
        WebElement usernameField=driver.findElement(By.name("username")); //storing usernamefield
        usernameField.sendKeys("Admin");  //sending keys to username field
        WebElement passwordField = driver.findElement(By.name("password"));  //storing password field
        passwordField.sendKeys("admin123");  //sendkeys to password field

        driver.close();  //closing browser

    }
}
