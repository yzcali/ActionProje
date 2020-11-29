package smokeTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Testbase;

public class AlertInterface extends Testbase {
    @Test
    public void alertWindow_test01() throws InterruptedException {

        driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
        driver.findElement(By.xpath("//*[@id='content']/button")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        String str= alert.getText();
        System.out.println(str);

        alert.accept();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='content']/button")).click();
        Thread.sleep(2000);

        alert.dismiss();
        driver.close();
    }
}
