package homepage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilitynopcommerce.Utility_NopCommerce;

import java.lang.invoke.SwitchPoint;

public class TopMenuTest extends Utility_NopCommerce {
    String BaseUrl = "https://demo.nopcommerce.com/";
    public void selectMenu(String menu){

        Actions action = new Actions(driver);

        switch(menu) {

            case "Computers":

                WebElement computers = driver.findElement(By.xpath("//a[@href='/computers']"));
                action.moveToElement(computers).click().build().perform();
                System.out.println(getTextFromElement(By.xpath("//h1[text()='Computers']")));
                Assert.assertEquals("Computers",getTextFromElement(By.xpath("//h1[text()='Computers']")));
                break;

            case "Electronics":

                WebElement electronics = driver.findElement(By.xpath("//a[@href='/electronics']"));
                action.moveToElement(electronics).click().build().perform();
                System.out.println(getTextFromElement(By.xpath("//h1[text()='Electronics']")));
                Assert.assertEquals("Electronics",getTextFromElement(By.xpath("//h1[text()='Electronics']")));
                break;

            case "Books":
                WebElement books= driver.findElement(By.xpath("//a[@href='/books']"));
                action.moveToElement(books).click().build().perform();
                System.out.println(getTextFromElement(By.xpath("//h1[text()='Books']")));
                Assert.assertEquals("Books",getTextFromElement(By.xpath("//h1[text()='Books']")));

                break;
        }
    }

    @Before

    public void loadUrl(){
        openBrowser(BaseUrl);

    }

    @Test

    public void verifyPageNavigation(){
        selectMenu("Electronics"); // passing string as a parameter -option we would like to be clicked and then
        // checking the text of it.





    }

    @After

    public void closeUrl(){
        driver.quit();

    }





}
