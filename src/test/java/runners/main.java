package runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class main {

   public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mstgl\\Desktop\\chrome selenıum\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);


    }
}
