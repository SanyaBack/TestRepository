package pageObjects;

import org.openqa.selenium.WebDriver;

public class BasePage {
    static WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }
}
