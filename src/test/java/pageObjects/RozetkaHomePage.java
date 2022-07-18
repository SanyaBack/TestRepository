package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHomePage extends BasePage{

    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    public static void navigateRozetka(){
        driver.get("https://rozetka.com.ua/");
    }

    public static WebElement getpopupHeader(){
        return driver.findElement(By.xpath("//button[contains(@class,'ng-tns-c94-1')]"));
    }

    public static WebElement getLogoHeader(){
        return driver.findElement(By.xpath("//a[@class='header__logo']"));
    }

    public static WebElement getCatalogHeader(){
        return  driver.findElement(By.xpath("//button[@id='fat-menu']"));
    }

    public static WebElement getFieldHeader(){
        return driver.findElement(By.xpath("//input[contains(@class,'search-form__input')]"));
    }

    public static WebElement getLangHeader(){
        return driver.findElement(By.xpath("//ul[contains(@class,'lang')]"));
    }

    public static WebElement getZSYHeader(){
        return driver.findElement(By.xpath("//a[contains(@class,'help-zsu')]"));
    }

    public static WebElement getRegHeader(){
        return driver.findElement(By.xpath("//li[contains(@class,'header-actions__item--user')]"));
    }

    public static WebElement getCartHeader(){
        return driver.findElement(By.xpath("//li[contains(@class,'header-actions__item--cart')]"));
    }

    public static WebElement getSearchButtonHeader(){
        return driver.findElement(By.xpath("//button[contains(@class,'button_color_green')]"));
    }

    public static WebElement getKatalogButton(){
        return driver.findElement(By.xpath("//button[@id='fat-menu']"));
    }

    public static WebElement getKatalogNotebookButton(){
        return driver.findElement(By.xpath("//a[text()='Ноутбуки']"));
    }

    public static WebElement getNotebookText(){
        return driver.findElement(By.xpath("//h1[text()='Ноутбуки']"));
    }


}
