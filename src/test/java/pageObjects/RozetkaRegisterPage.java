package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaRegisterPage extends BasePage{

    public RozetkaRegisterPage(WebDriver driver) {
        super(driver);
    }

    public static void navigateRozetka(){
        driver.get("https://rozetka.com.ua/");
    }

    public static WebElement getButtonRegister(){
        return driver.findElement(By.xpath("//button[contains((@class),'button--link')]"));
    }

    public static WebElement getRegisterNameField(){
        return driver.findElement(By.xpath("//input[@id='registerUserName']"));
    }

    public static WebElement getRegisterSurnameField(){
        return driver.findElement(By.xpath("//input[@id='registerUserSurname']"));
    }

    public static WebElement getRegisterGmailField(){
        return driver.findElement(By.xpath("//input[@id='registerUserEmail']"));
    }

    public static WebElement getRegisterPhoneField(){
        return driver.findElement(By.xpath("//input[@id='registerUserPhone']"));
    }

    public static WebElement getRegisterPasswordField(){
        return driver.findElement(By.xpath("//input[@id='registerUserPassword']"));
    }

    public static WebElement getRegisterAcceptButtonField(){
        return driver.findElement(By.xpath("//button[contains(@class,'auth-modal__submit')]"));
    }

    public static WebElement getRegisterExitButton(){
        return driver.findElement(By.xpath("//button[contains(@class,'modal__close')]"));
    }

}
