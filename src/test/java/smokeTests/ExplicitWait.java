package smokeTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.Testbase;

public class ExplicitWait extends Testbase {
    @Test
    public void wait_test01(){
        driver.get("http://www.softwaretestingmaterial.com");
        driver.manage().window().maximize();
        //This waits up to 15 seconds before throwing a TimeoutException or if it finds the element will return it in 0 - 15 seconds
        WebDriverWait wait= new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.titleIs("Software Testing Material - A site for Software Testers"));
        driver.close();
        //Change the title "Software Testing Material - A site for Software Testers" as "xyz" in the script and try
    }
}
