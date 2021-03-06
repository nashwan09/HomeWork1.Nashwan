package alibaba;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestAB extends HelperClassAliBaba {

    @Test
    public static void viewMore () {
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/a[5]")).click();
    }

    @Test
    public static void myAliBaba () {
        driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[4]/div[1]/div[1]/div[1]/a/div")).click();
    }

    @Test
    public static void searchEngine () throws InterruptedException {
        driver.findElement(By.cssSelector("#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-searchbar-wrap > div > div > form > div.ui-searchbar-main > input")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-searchbar-wrap > div > div > form > div.ui-searchbar-main > input")).sendKeys("mask");
    }

    @Test
    public static void cart () {
        driver.findElement(By.cssSelector("#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-m-notify.sc-hd-float-r.sc-hd-text-right > div.J-hd-m-notify-tab.sc-hd-ms-tab.sc-hd-ms-cart.J-sc-hd-ms-cart > div > div > a > div > div.sc-hd-icon-container > a")).click();
    }

    @Test
    public static void messages () {
        driver.findElement(By.cssSelector("#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-m-notify.sc-hd-float-r.sc-hd-text-right > div.J-hd-m-notify-tab.sc-hd-hide-s.sc-hd-ms-tab.sc-hd-ms-message.J-sc-hd-ms-message > div.sc-hd-m-notify > div > div > div.sc-hd-icon-container > a")).click();
    }

    @Test
    public static void readyToShip () throws InterruptedException {
        driver.findElement(By.cssSelector("#J_SC_header > header > div.sc-hd-row.sc-hd-link > div > div.sc-hd-links-box > ul > li:nth-child(1) > a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"3973742920\"]/div/div[2]/div[2]/div/ul/li[4]/a")).click();
    }

}
