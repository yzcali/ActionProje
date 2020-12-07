package smokeTests;

import com.sun.javafx.scene.KeyboardShortcutsHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Testbase;

public class DubClickTest extends Testbase {
    @Test
    public void dClick() throws InterruptedException {
        driver.get("http://api.jquery.com/dblclick/");
        driver.manage().window().maximize();
        //As per the above URL we need to switch to frame. The targeted element is in the frame
        driver.switchTo().frame(0);
        //Create the object 'action'
        Actions actions= new Actions(driver);
        //Find the targeted element
        driver.findElement(By.xpath("/html/body/div") );
         Thread.sleep(3000);
        actions.doubleClick().build().perform();
        Thread.sleep(2000);
        driver.close();

    }
}
