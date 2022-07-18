package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.RozetkaHomePage;
import pageObjects.RozetkaRegisterPage;
import pageObjects.RozetkaSearchFieldPage;

public class TestRozetka extends TestInit{


    @Test
    public void checkHeaderElements(){
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        goToRozetka();


        Assert.assertTrue(rozetkaHomePage.getLogoHeader().isDisplayed());
        Assert.assertTrue(rozetkaHomePage.getpopupHeader().isDisplayed());
        Assert.assertTrue(rozetkaHomePage.getCatalogHeader().isDisplayed());
        Assert.assertTrue(rozetkaHomePage.getFieldHeader().isDisplayed());
        Assert.assertTrue(rozetkaHomePage.getLangHeader().isDisplayed());
        Assert.assertTrue(rozetkaHomePage.getZSYHeader().isDisplayed());
        Assert.assertTrue(rozetkaHomePage.getRegHeader().isDisplayed());
        Assert.assertTrue(rozetkaHomePage.getCartHeader().isDisplayed());

    }

    @Test
    public void checkFieldResult(){
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        goToRozetka();

        rozetkaHomePage.getFieldHeader().sendKeys("iphone 13");
        rozetkaHomePage.getSearchButtonHeader().click();

        sleep(4);

        RozetkaSearchFieldPage rozetkaSearchFieldPage = new RozetkaSearchFieldPage(driver);
        Assert.assertTrue(rozetkaSearchFieldPage.getResultField().isDisplayed());

    }

    @Test
    public void checkRegisterButton(){
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        goToRozetka();

        rozetkaHomePage.getRegHeader().click();
        sleep(4);

        RozetkaRegisterPage.getButtonRegister().click();
        sleep(4);

        RozetkaRegisterPage.getRegisterNameField().sendKeys("Саша");
        RozetkaRegisterPage.getRegisterSurnameField().sendKeys("Бекст");
        RozetkaRegisterPage.getRegisterPhoneField().sendKeys("681704971");
        RozetkaRegisterPage.getRegisterGmailField().sendKeys("retrogamityi1@gmail.com");
        RozetkaRegisterPage.getRegisterPasswordField().sendKeys("Golden2288");

        RozetkaRegisterPage.getRegisterAcceptButtonField().click();
        sleep(4);

        Assert.assertTrue(RozetkaRegisterPage.getRegisterExitButton().isDisplayed());

        RozetkaRegisterPage.getRegisterExitButton().click();
    }

    @Test

    public void checkKatalogButton(){
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        goToRozetka();

        RozetkaHomePage.getKatalogButton().click();
        RozetkaHomePage.getKatalogNotebookButton().click();
        sleep(4);

        Assert.assertTrue(RozetkaHomePage.getNotebookText().isDisplayed());
    }

}
