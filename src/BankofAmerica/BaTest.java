package BankofAmerica;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BaTest extends HelperClassBanKOfAmerica {

    @Test
    public static void onlineId () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"onlineId1\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"onlineId1\"]")).sendKeys("nashwan");
    }

    @Test
    public static void password () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"passcode1\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"passcode1\"]")).sendKeys("123456");
    }

    @Test
    public static void logIn () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"onlineId1\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"onlineId1\"]")).sendKeys("nashwan");
        driver.findElement(By.xpath("//*[@id=\"passcode1\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"passcode1\"]")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"signIn\"]")).click();
    }

    @Test
    public static void searchEngine () {
        driver.findElement(By.xpath("//*[@id=\"nav-search-query\"]")).sendKeys("payment");
    }

    @Test
    public static void searchButton () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-search-query\"]")).sendKeys("payment");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"searchStub\"]/div/div/form/div[1]/input[2]")).click();
    }

    @Test
    public static void creditCard () {
        driver.findElement(By.xpath("//*[@id=\"navCreditCards\"]")).click();
    }

    @Test
    public static void shopCreditCards () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"navCreditCards\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnCompareCreditCards")).click();
    }

    @Test
    public static void smallBusiness () {
        driver.findElement(By.id("NAV_BUSINESS_ADVANTAGE")).click();
    }

//    @Test
//    public static void openAccount () throws InterruptedException {
//        driver.findElement(By.id("NAV_BUSINESS_ADVANTAGE")).click();
//       // Thread.sleep(1000);
//       // driver.findElement(By.xpath("//*[@id=\"SGE1QH04\"]/div[2]/div[4]")).click();
//    }
}
