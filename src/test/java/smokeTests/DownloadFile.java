package smokeTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Testbase;

import java.io.IOException;

public class DownloadFile extends Testbase {

    @Test
    public void dFileTest01() throws IOException {
        //to open URL
    driver. get("\"http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html\"");
        //Download Text File
        driver.findElement(By.xpath("//*[@id='post-body-5864649494765988891']/div[1]/form/div[1]/a[1]")).click();
        //To call the AutoIt script
        Runtime.getRuntime().exec("D:\\SoftwareTestingMaterial\\AutoIt\\DownloadFile.exe");
      driver.close();
    }
}
