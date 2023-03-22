package jso.net;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jaja {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://www.google.co.in/");
        //driver1.findElement(By.name("q")).sendKeys("ajiajiaj");


        driver1.quit();
    }
}