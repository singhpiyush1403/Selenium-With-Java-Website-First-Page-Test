import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lunch_Browser {
    public static void main(String[] args) throws InterruptedException {
       
        System.setProperty("webdriver.chrome.driver", "C://Users//piyus//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.get("https://www.cybersecnexus.com/");
    
        driver.quit();
    }
}
