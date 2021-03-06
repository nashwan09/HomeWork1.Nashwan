package amazonSelfPracticeFromClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePageP {

    public static void main(String[] args) {

        //Firefox
//        String fireFoxDriverPath = "BrowserDriver/windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get("https://www.amazon.com/Online-Stores/s?k=Online+Stores");

        //Chrome
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mask");
        driver.findElement(By.id("nav-search-submit-button")).click();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.close();
    }


}
