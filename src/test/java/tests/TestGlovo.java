package tests;

import org.testng.annotations.Test;
import pageObjects.GlovoHomePage;
import pageObjects.GoogleHomePage;

public class TestGlovo extends TestInit{

    @Test
    public void buttonClick2(){

        GlovoHomePage glovoHomePage = new GlovoHomePage(driver);
        goToGlovo();
        glovoHomePage.getButtonReg().click();
        sleep(4);
    }

}
