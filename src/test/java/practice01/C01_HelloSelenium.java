package practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_HelloSelenium {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver =new ChromeDriver();
        driver.get("https://selenium.dev.com");
        Thread.sleep(3000);
        driver.quit();


    }
}
