package tdBank;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestTD extends HelperClassTDBank {

    @Test
    public static void logIn () {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section/div/div/div/div/div[2]/div[1]/button")).click();
    }

    @Test
    public static void signUp () {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section/div/div/div/div/div[2]/div[2]/a")).click();
    }

    @Test
    public static void checkingAccount () {
        driver.findElement(By.xpath("//*[@id=\"drag-id-tabsCarousel0\"]/div/li[1]/div[1]/span/span")).click();
    }

    @Test
    public static void homeEquity () {
        driver.findElement(By.xpath("//*[@id=\"drag-id-tabsCarousel0\"]/div/li[4]/div[1]/span/span")).click();
    }

    @Test
    public static void digitalBanking () {
        driver.findElement(By.xpath("//*[@id=\"main\"]/section[6]/div/div/div/div/div[1]/div/div[2]/div[2]/div/a")).click();
    }
}
