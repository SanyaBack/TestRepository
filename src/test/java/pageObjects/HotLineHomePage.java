package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotLineHomePage extends BasePage {
    public HotLineHomePage(WebDriver driver) {
        super(driver);
    }


    public WebElement getLogButton(){
        return driver.findElement(By.xpath("//div[contains(@class,'item-login')]"));
    }

    public WebElement getGoogleLogButton(){
        return driver.findElement(By.xpath("//span[@id='googleLogin']"));
    }

    public WebElement getGoogleLogField(){
        return driver.findElement(By.xpath("//input[@name='identifier']"));
    }

    public WebElement getGoogleNextButton(){
        return driver.findElement(By.xpath("//span[contains(@class,'VfPpkd-vQzf8d') and contains(text(),'Далее')]"));
    }



}
