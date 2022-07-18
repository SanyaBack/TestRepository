package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class GlovoHomePage extends BasePage {

    public GlovoHomePage(WebDriver driver) {
        super(driver);
    }

    private static final String GLOVO_BUT_REG = "//button[@id='user-register']";

    public WebElement getButtonReg(){
        return driver.findElement(By.xpath(GLOVO_BUT_REG));
    }

}
