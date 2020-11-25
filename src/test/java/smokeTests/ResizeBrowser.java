package smokeTests;

import org.testng.annotations.Test;
import utilities.Testbase;
import org.openqa.selenium.Dimension;


public class ResizeBrowser extends Testbase {
    @Test
    public void resizes01(){
       driver.navigate().to("http://ebay.com");
        System.out.println(driver.manage().window().getSize());
        //Create object of Dimensions class
        Dimension d = new Dimension(516,620);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);
        System.out.println(driver.manage().window().getSize());

    }
}
// results (1616, 876)
//(516, 620)