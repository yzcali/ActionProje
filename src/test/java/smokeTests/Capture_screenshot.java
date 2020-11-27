package smokeTests;
import java.io.File;
import com.mongodb.MapReduceCommand;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import utilities.Testbase;


import java.io.IOException;

public class Capture_screenshot extends Testbase {
    @Test
    public void c_screenshot_test01() throws IOException {
     driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-using-selenium-webdriver");
     File screenshotFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png") );
      driver.close();
      driver.quit();


    }
}
