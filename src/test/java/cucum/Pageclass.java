package cucum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageclass extends BaseClass{

WebDriver driver;
//    @FindBy(xpath = "//input[@name='q']")
//  private WebElement txta;

    public Pageclass(WebDriver driver){
//     PageFactory.initElements(BaseClass.driver,this);
        this.driver=driver;
    }


public void locator(String val) {
    driver.findElement(By.name("q")).sendKeys(val);

}


//    public WebElement getTxta() {
//        return txta;
//    }


 }


