package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PayseraHomePage;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPaysera extends TestInit{

    @Test
    public void testFirst() {
        PayseraHomePage payseraHomePage = new PayseraHomePage(driver);

        goToPaysera();
        sleep(4);

        moveToElement(payseraHomePage.getBuyField());
        payseraHomePage.getBuyField().sendKeys("123");
        Assert.assertTrue(payseraHomePage.getSellWithClassEmptyField().isDisplayed());

        payseraHomePage.getSellField().sendKeys("456");
        Assert.assertTrue(payseraHomePage.getBuyWithClassEmptyField().isDisplayed());
    }

    @Test
    public void testSecond(){
        PayseraHomePage payseraHomePage = new PayseraHomePage(driver);

        goToPaysera();
        sleep(3);
        moveToElement(payseraHomePage.getOfficialRateUSDField());

        payseraHomePage.getEURCurrency().isDisplayed();

        String officialRateUSDBeforeChangingCountry = payseraHomePage.getOfficialRateUSDField().getText();
        String commercialRateUSDBeforeChangingCountry = payseraHomePage.getCommercialRateUSDField().getText();
        String payseraAmountUSDBeforeChangingCountry = payseraHomePage.getPayseraAmountUSDField().getText();

        moveToElement(payseraHomePage.getChangeCountryDropUp());

        payseraHomePage.getChangeCountryDropUp().click();
        payseraHomePage.getChangeCountryDropDown().click();
        payseraHomePage.getUkraineBtn().click();

        sleep(4);
        moveToElement(payseraHomePage.getOfficialRateUSDField());

        payseraHomePage.getUAHCurrency().isDisplayed();

        String officialRateUSDAfterChangingCountry = payseraHomePage.getOfficialRateUSDField().getText();
        String commercialRateUSDAfterChangingCountry = payseraHomePage.getCommercialRateUSDField().getText();
        String payseraAmountUSDAfterChangingCountry = payseraHomePage.getPayseraAmountUSDField().getText();

        assertThat(officialRateUSDBeforeChangingCountry).isNotEqualTo(officialRateUSDAfterChangingCountry);
        assertThat(commercialRateUSDBeforeChangingCountry).isNotEqualTo(commercialRateUSDAfterChangingCountry);
        assertThat(payseraAmountUSDBeforeChangingCountry).isNotEqualTo(payseraAmountUSDAfterChangingCountry);
    }

    @Test
    public void testThird(){
        PayseraHomePage payseraHomePage = new PayseraHomePage(driver);

        goToPaysera();
        sleep(5);
        moveToElement(payseraHomePage.getSwedBankAmountUSDField());

        double payseraAmountUSD = Double.parseDouble(payseraHomePage.getPayseraAmountUSDField().getText());
        double swedBankAmountUSD = Double.parseDouble(payseraHomePage.getSwedBankAmountUSDField().getText());

        if(payseraAmountUSD > swedBankAmountUSD) {
            payseraHomePage.getDifferenceBetweenPayseraAndSwedBankAmounts().isDisplayed();
        }

        String differenceBetweenPayseraAndSwedBankAmountsAsString = payseraHomePage.getDifferenceBetweenPayseraAndSwedBankAmounts().getText();
        differenceBetweenPayseraAndSwedBankAmountsAsString = differenceBetweenPayseraAndSwedBankAmountsAsString.replaceAll("[^-.0-9]", "");

        double differenceBetweenPayseraAndSwedBankAmountsAsDouble = Double.parseDouble(differenceBetweenPayseraAndSwedBankAmountsAsString);


        assertThat(differenceBetweenPayseraAndSwedBankAmountsAsDouble).isEqualTo(Math.ceil((payseraAmountUSD - swedBankAmountUSD)*10)/10 * (-1));
    }
}

