package computer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
    String BaseUrl = "https://demo.nopcommerce.com/";
    public static WebDriver driver;


    public void openBrowser(String BaseUrl){
        //setting up browser for incognito mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        //browser setup
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(BaseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }





    //closing browser
    public void closeBrowser() {
        driver.quit();
    }

}
