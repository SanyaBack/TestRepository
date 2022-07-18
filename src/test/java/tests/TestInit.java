package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import java.time.Duration;

public class TestInit {

    WebDriver driver;
    Actions actions;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void setupActions() {
        actions = new Actions(driver);
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown() {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.quit();
    }

    public void goToGoogle() {
        driver.get("https://www.google.com.ua/?hl=ua");
    }

    public void goToGlovo() {
        driver.get("https://glovoapp.com/ua/uk/?utm_source=google&utm_medium=cpc&utm_campaign=Google_Performance_UA_ALLOpen_Search_cpa_All_FirstOrder_0_NewUsers_Ukranian__DigitalBudget_NoPromo_0_09032022&utm_campaignid=16522052603&utm_adgroupid=138729032087&utm_term=%28_term%29&utm_matchtype=%28_matchtype%29&utm_device=%28_device%29&gclid=CjwKCAjwkYGVBhArEiwA4sZLuGiUbTIguL1y7wZPN8LIl8OVKFFG0Xu6xh-F85LaCF3R5SDnkqtGJxoCgyoQAvD_BwE");
    }

    public void goToRozetka() {
        driver.get("https://rozetka.com.ua/");
    }

    public void goToPaysera() {
        driver.get("https://www.paysera.bg/v2/en-LT/fees/currency-conversion-calculator");
    }

    public void goToHotLine() { driver.get("https://hotline.ua/");}

    public void moveToElement(WebElement element) {
        actions.moveToElement(element);
        actions.perform();
    }

}
