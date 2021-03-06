package cigna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HelperClassCigna {

//    static WebDriver driver;
//    static String cignaUrl = "https://www.cigna.com/";
//
//    @BeforeMethod
//    public static void openBrowser() {
//        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        driver = new ChromeDriver();
//        driver.get(cignaUrl);
//        driver.manage().window().maximize();
//
//    }
//
//    @AfterMethod
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.quit();

    //   }
//}
    static WebDriver driver;
    static String cignaUrl = "https://www.cigna.com/";

    @BeforeMethod
    public static void openBrowser() throws InterruptedException {

        String chromeDriverPath = "./BrowserDriver/windows/chromedriver.exe";

        //System property for chrome driver
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        //Instantiate a ChromeDriver class
        driver = new ChromeDriver();
        //Launch Website
        driver.get(cignaUrl);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        //driver.quit();
    }

}