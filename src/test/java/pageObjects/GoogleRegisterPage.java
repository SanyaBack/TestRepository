package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleRegisterPage extends BasePage{

    public GoogleRegisterPage(WebDriver driver) {
        super(driver);
    }

    private static final String GOOGLE_LOG_FIELD = "identifier";

    public WebElement getGoogleLogField(){
        return driver.findElement(By.name(GOOGLE_LOG_FIELD));
    }

    public WebElement getGoogleNextButton(){
        return driver.findElement(By.xpath("//span[contains(@class,'VfPpkd-vQzf8d') and contains(text(),'Далее')]"));
    }

}

