package smokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Testbase;

public class UploadAFile extends Testbase {
    @Test
    public void UpLoadFTest01(){
        //To open URL "http://softwaretestingmaterial.com"
        driver.get("\"http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
        //Locating 'browse' button
        WebElement browse = driver.findElement(By.id("uploadfile"));
        //pass the path of the file to be uploaded using Sendkeys method
        browse.sendKeys("D:\\SoftwareTestingMaterial\\UploadFile.txt");
        driver.close();
    }
}
