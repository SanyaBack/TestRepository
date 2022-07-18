package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PayseraHomePage extends BasePage{
    public PayseraHomePage(WebDriver driver) {
        super(driver);
    }

    public static void navigatePaysera(){
        driver.get("https://www.paysera.bg/v2/en-LT/fees/currency-conversion-calculator");
    }

    public WebElement getSellField(){
        return driver.findElement(By.xpath("//input[contains(@data-ng-model,'from_amount')]"));
    }

    public WebElement getBuyField(){
        return driver.findElement(By.xpath("//input[contains(@data-ng-model,'to_amount')]"));
    }

    public WebElement getSellWithClassNotEmptyField(){
        return driver.findElement(By.xpath("//input[contains(@class,'ng-not-empty')]"));
    }

    public WebElement getBuyWithClassNotEmptyField(){
        return driver.findElement(By.xpath("//input[contains(@class,'ng-not-empty')]"));
    }

    public WebElement getSellWithClassEmptyField(){
        return driver.findElement(By.xpath("//input[contains(@class,'ng-empty') and contains(@data-ng-model,'from_amount')]"));
    }

    public WebElement getBuyWithClassEmptyField(){
        return driver.findElement(By.xpath("//input[contains(@class,'ng-empty') and contains(@data-ng-model,'to_amount')]"));
    }

    public WebElement getUSDCurrencyFromTable(){
        return driver.findElement(By.xpath("//td[contains(normalize-space(),'USD')]"));
    }

    public WebElement getOfficialRateUSDField(){
        return driver.findElement(By.xpath("//td[contains(normalize-space(),'USD')]//following::td[contains(@data-title,'Official rate')][1]//span//span//span"));
    }

    public WebElement getCommercialRateUSDField(){
        return driver.findElement(By.xpath("//td[contains(normalize-space(),'USD')]//following::td[contains(@class,'commercial-rate')][1]"));
    }

    public WebElement getPayseraAmountUSDField(){
        return driver.findElement(By.xpath("//td[contains(normalize-space(),'USD')]//following::td[contains(@data-title,'Paysera rate')][1]//span//span//span"));
    }

    public WebElement getSwedBankAmountUSDField(){
        return driver.findElement(By.xpath("//td[contains(normalize-space(),'USD')]//following::td[contains(@data-title,'Swedbank amount')][1]//span//span//span[1]"));
    }

    public WebElement getDifferenceBetweenPayseraAndSwedBankAmounts(){
        return driver.findElement(By.xpath("//td[contains(normalize-space(),'USD')]//following::td[contains(@data-title,'Swedbank amount')][1]//span//span//span[2]"));
    }

    public WebElement getChangeCountryDropUp(){
        return driver.findElement(By.xpath("//span[contains(@class,'dropup')]"));
    }

    public WebElement getChangeCountryDropDown(){
        return driver.findElement(By.xpath("//button[@id='countries-dropdown']"));
    }

    public WebElement getUkraineBtn(){
        return driver.findElement(By.xpath("//a[contains(normalize-space(),'Ukraine')]"));
    }

    public WebElement getEURCurrency(){
        return driver.findElement(By.xpath("//span[contains(text(),'EUR')]"));
    }

    public WebElement getUAHCurrency(){
        return driver.findElement(By.xpath("//span[contains(text(),'UAH')]"));
    }

}
