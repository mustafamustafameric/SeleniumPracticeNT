package practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class C01_HelloSeleniumSafari {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new SafariDriver();
        driver.get("https://selenium.dev");
        Thread.sleep(3000);
        driver.quit();
    }
}
