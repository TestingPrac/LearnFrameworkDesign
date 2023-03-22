package cucum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Stepdef extends BaseClass {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm");
        driver.get("https://www.google.co.in/");

        try {
            System.out.println("waiting");

            WebDriverWait wait = new WebDriverWait(driver, 30);

            wait.until(ExpectedConditions.alertIsPresent());

            System.out.println("alert present");
            Alert alert = driver.switchTo().alert();
            alert.accept();


        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("handled");
            driver.navigate().refresh();
        }

        driver.findElement(By.name("q")).sendKeys("flower");

//    driver.quit();

        //            WebDriverWait wait = new WebDriverWait(driver, 5);
//            wait.until(ExpectedConditions.alertIsPresent());
//
//            Alert alert = driver.switchTo().alert();
////            System.out.println(“Alert box text ” + alert.getText());
//            alert.accept();
//

//       BaseClass.browesr("https://www.google.co.in/");
//        Pageclass pageclass = new Pageclass(BaseClass.driver);
//
//        pageclass.locator("asdfgh");
////       BaseClass.locat();

//       BaseClass.locator(pageclass.getTxta(),"ahjdsjj" );
    }
}
