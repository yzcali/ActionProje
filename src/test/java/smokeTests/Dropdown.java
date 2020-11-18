package smokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.Testbase;

public class Dropdown extends Testbase {
    @Test
    public void selectClassTest() throws InterruptedException {
        driver.get("http://intersport.fr");
        driver.navigate().refresh();
        Thread.sleep(3000);

        WebElement menu= driver.findElement(By.xpath("//*[@id='header-nav']/div/button"));
        Select dropdown = new Select(menu);
        dropdown.selectByVisibleText("Sport");

    }

}
