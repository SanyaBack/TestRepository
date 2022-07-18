package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends BasePage{


    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//input[@name='q']"));
    }

    public static WebElement getButtonPict(){
        return driver.findElement(By.xpath("//div[@class='gb_e gb_f']/a[text()='Картинки']"));
    }


}
