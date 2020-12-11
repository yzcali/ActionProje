package F_smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Testbase;

public class ConditionalCommands extends Testbase {
    @Test
            public void test01(){
        driver.get("https://facebook.com");
        WebElement email= driver.findElement(By.id("email"));
        WebElement pass= driver.findElement(By.id("pass"));
         if (email.isDisplayed() && pass.isEnabled()){
             System.out.println("ok");
         }
         else {
             System.out.println("not here"); // ok
         }

      driver.close();


    }

}
