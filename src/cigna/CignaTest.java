package cigna;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CignaTest extends HelperClassCigna {

    @Test
    public static void logo() {
        driver.findElement(By.cssSelector("#ssi-includes > div > header > div.d-none.d-lg-block > nav.navbar.global-nav.logo-nav.navbar-expand-lg.navbar-white.bg-white > div > a > svg")).isDisplayed();

    }

    @Test
    public static void logIn() {
        driver.findElement(By.cssSelector("#ssi-includes > div > header > div.d-none.d-lg-block > nav.navbar.global-nav.logo-nav.navbar-expand-lg.navbar-white.bg-white > div > ul > li:nth-child(2) > a")).click();
    }

    @Test
    public static void dentalInsurance() {
        driver.findElement(By.cssSelector("#\\31 564310141632 > div > div.col-12.col-lg-5.left-block.variant-block-section > div > div:nth-child(3) > div > a")).click();
    }
    @Test
    public static void searchCigna() throws InterruptedException {
        driver.findElement(By.cssSelector("#search-desktop")).sendKeys("Health");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#ssi-includes > div > header > div.d-none.d-lg-block > nav.navbar.global-nav.universal-navigation.navbar-expand-lg.navbar-white.bg-white > div > ul > li:nth-child(4) > form > div > div > span > button")).click();
    }

    @Test
    public static void covidKey (){
        driver.findElement(By.cssSelector("#\\31 583802536510 > div > div > p > a")).click();
    }

    @Test
    public static void contactUs() throws InterruptedException {
        driver.findElement(By.cssSelector("#ssi-includes > div > header > div.d-none.d-lg-block > nav.navbar.global-nav.universal-navigation.navbar-expand-lg.navbar-white.bg-white > div > ul > li:nth-child(2) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#\\31 555225043556 > div > div > div > div:nth-child(1) > p.mb-0 > a ")).click();
    }

}
