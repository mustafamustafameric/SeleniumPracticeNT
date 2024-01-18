package practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_FirstTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //Ebay web sayfasina git

        driver.get("https://www.ebay.com");

        //Sayfanın Title testini yap, title ekrana yazdır
        //Electronics, Cars, Fashion, Collectibles & More | eBay
        System.out.println("Title: " +driver.getTitle());

        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title Test Pass");
        } else {
            System.err.println("Title Test Failed");
        }

        //Sayfanın URL testini yap. url ekrana yazdır
        String expectedUrl = "https://www.ebay.com/";
        String actualUrl = driver.getCurrentUrl();

        System.out.println("URL: " + actualUrl);

        if(expectedUrl.equals(actualUrl)){
            System.out.println("URL Test Pass");
        } else {
            System.err.println("URL Test Failed");
        }

        //pagesource ekrana yazdır
        //System.out.println("Page Source: " + driver.getPageSource());

        driver.quit();

    }
}