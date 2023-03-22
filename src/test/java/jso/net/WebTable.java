package jso.net;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    driver.get("https://www.moneycontrol.com/");

//    for loop
//    List<WebElement> row = driver.findElements(By.xpath("(//table[@class='rhsglTbl'])[2]//tr"));
//        System.out.println(row.size());
//    for(int i=0;i<row.size();i++){
//        List<WebElement> td = driver.findElements(By.xpath("(//table[@class='rhsglTbl'])[2]//tr["+i+"]//td"));
//        System.out.println(td.size());
//        for(int j=0;j<td.size();j++){
//            System.out.println(td.get(j).getText());
//        }
//    }

//        For each



//        List<WebElement> row = driver.findElements(By.xpath("(//table[@class='rhsglTbl'])[2]//tr"));
        List<WebElement> td = driver.findElements(By.xpath("(//table[@class='rhsglTbl'])[2]//tr//td"));

        for (WebElement row1:td) {
            System.out.println(row1.getText());
        }




    }



}
