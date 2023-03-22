package jso.net;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Page {
    WebDriver driver = new ChromeDriver();


    public  void radioOutBoundCallStatus(String locate) {
       driver.findElement(By.xpath("//label[contains(text(),'"+locate+"')]")).click();
    }



    @FindBy(xpath = "//label[contains(text(),'Answered/not Verified')]")
    WebElement radioOutBoundCallStatus;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement btnSubmit1;

    //Process nvestigate

    @FindBy(xpath = "//img[@alt='Call to complainant']")
    WebElement imgPhone;

}
