package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaSearchFieldPage extends BasePage{
    public RozetkaSearchFieldPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultField(){
        return driver.findElement(By.xpath("//h1[contains(text,'')]]"));
    }
}
