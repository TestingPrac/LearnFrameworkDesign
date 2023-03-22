package cucum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;


    public static void browesr(String a){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(a);
    }
    public static void locat() {
        driver.findElement(By.name("q")).sendKeys("ajiajiaj");

    }



    public static void locator(WebElement element ,String val) {
        element.sendKeys(val);

    }



    public static void quite() {
        driver.quit();
    }
}
