package jso.net;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 class Jajapage  {
WebDriver driver = new ChromeDriver();
    public void Jajapage(){

        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "q")
    private WebElement txta;

    public void hh(){
        txta.sendKeys("aaaa");
    }






}
