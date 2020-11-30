package smokeTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Testbase;
import org.testng.annotations.Test;
public class DDropTest extends Testbase {
  @Test
    public void d_test01(){
        driver.get("http://jqueryui.com/droppable/");
         Actions actions = new Actions(driver);
      // WebdriverWait is used to wait for a frame to be available. Once it is available we switch to the frame to achieve our task

      WebDriverWait wait = new WebDriverWait(driver,5);
      wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
      //To get source locator
      WebElement sourceLocator = driver.findElement(By.cssSelector("#draggable"));
      //To get target locator
      WebElement targetLocator = driver.findElement(By.cssSelector("#droppable"));

      //dragAndDrop(source, target) method accepts two parameters source and locator.
      //used dragAndDrop method to drag and drop the source locator to target locator
      actions.dragAndDrop(sourceLocator,targetLocator).build().perform();
  }

}
