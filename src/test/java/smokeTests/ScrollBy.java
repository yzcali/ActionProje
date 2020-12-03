package smokeTests;

import org.testng.annotations.Test;
import utilities.Testbase;

import org.openqa.selenium.JavascriptExecutor;
public class ScrollBy extends Testbase {
    @Test
    public void scrollDown() {
        driver.navigate().to("https://nike.com");

        //to perform Scroll on application using  Selenium

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");


    }

    @Test
    public void scrollD() {
        driver.navigate().to("https://nike.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    @Test
    public void scrollUp() {
        driver.navigate().to("https://nike.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-250)", "");

    }
}