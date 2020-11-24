package smokeTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Testbase;

public class TestNGAssert extends Testbase {
    @Test
    public void assertTest01() throws InterruptedException {
        //Test Condition 1: If Page title matches with actualTitle then it finds email title and enters the value which we pass
        driver.get("https://www.gmail.com");
        String actualTitle= "Gmail";
        Assert.assertEquals(driver.getTitle(), actualTitle);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("SoftwareTestingMaterial.com");
        //Test Condition 2: If page title didnt match with actualTitle then script throws an exception
        Thread.sleep(2000);
        driver.get("https://www.gmail.com");
        actualTitle= "GoogleMail";
        Thread.sleep(2000);
        //Assert.assertEquals(driver.getTitle(), actualTitle, "Title not matched");
        Assert.assertEquals(driver.getTitle(), actualTitle);





    }
}
