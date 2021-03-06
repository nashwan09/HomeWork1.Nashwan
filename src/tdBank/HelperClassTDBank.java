package tdBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HelperClassTDBank {

    static WebDriver driver;
    static String tdUrl = "https://www.td.com/us/en/personal-banking/";

    @BeforeMethod
    public static void openBrowser() throws InterruptedException {

        String chromeDriverPath = "./BrowserDriver/windows/chromedriver.exe";

        //System property for chrome driver
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        //Instantiate a ChromeDriver class
        driver = new ChromeDriver();
        //Launch Website
        driver.get(tdUrl);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
