package tests;

import org.testng.annotations.Test;
import pageObjects.GoogleRegisterPage;
import pageObjects.HotLineHomePage;

public class TestHotLine extends TestInit{


    @Test
        public void TestRegistration() {
            HotLineHomePage hotLineHomePage = new HotLineHomePage(driver);

            goToHotLine();
            sleep(2);

            hotLineHomePage.getLogButton().click();
            hotLineHomePage.getGoogleLogButton().click();
            sleep(2);

            String winHandleBefore = driver.getWindowHandle();

            for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
            }

//        driver.close();
//
//        driver.switchTo().window(winHandleBefore);

            GoogleRegisterPage googleRegisterPage = new GoogleRegisterPage(driver);


            googleRegisterPage.getGoogleLogField().sendKeys("retrogamityio1@gmail.com");
            googleRegisterPage.getGoogleNextButton().click();
            sleep(2);

        }
    }


