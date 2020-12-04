package smokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Testbase;

public class Right_click_Test extends Testbase {

    @Test
    public void RcTest01() throws InterruptedException {
  driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
  driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        //contextClick() method to do right click on the element
        actions.contextClick().build().perform();
        Thread.sleep(5000);
        WebElement getCopyText = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
        //getText() method to get the text value
        String GetText=getCopyText.getText();
        //To print the value
        System.out.println(GetText);
         driver.close();

    }
}
