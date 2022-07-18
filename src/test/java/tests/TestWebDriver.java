package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.GoogleHomePage;

public class TestWebDriver extends TestInit{

    @Test
    public void runGoogle(){
        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getSearchField().sendKeys("dogs\n");
    }

    @Test
    public void buttonClick(){

        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        GoogleHomePage.getButtonPict().click();

    }


}
