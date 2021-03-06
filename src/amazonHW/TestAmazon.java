package amazonHW;

import alibaba.HelperClassAliBaba;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestAmazon extends HelperClassAmazon {


    @Test()
    public static void bestSellerDevice() {
        driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
        driver.findElement(By.xpath("//a[@href='https://www.amazon.com/Best-Sellers-Toys-Games/zgbs/toys-and-games/ref=zg_bs_nav_0']")).click();
    }

    @Test()
    public static void findAGift() {

        driver.findElement(By.linkText("Find a Gift")).click();
        driver.findElement(By.xpath("//span[text()='Gift Cards']")).click();
    }

    @Test()
    public static void moversAndShakers() {

        driver.findElement(By.cssSelector("#nav-hamburger-menu > span")).click();
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(4) > a")).click();
        driver.findElement(By.cssSelector("#zg_browseRoot > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#zg-ordered-list > li:nth-child(3) > span > div > span > a > div")).click();
    }

    @Test()
    private static void searchButtonFunctionality(){
        WebElement sr=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        sr.sendKeys("toys");
        driver.findElement(By.id("twotabsearchtextbox")).click();
    }

    @Test()
    public static void checkHello() {
        HelperClassAmazon.driver.findElement(By.id("glow-ingress-line1")).isDisplayed();
    }

    @Test()
    public static void checkPrime() {
        HelperClassAmazon.driver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span[1]")).click();
    }
}
