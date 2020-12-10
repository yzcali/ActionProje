package F_smokeTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Testbase;

public class GetCommands extends Testbase {
    @Test
    public void getC(){
        driver.get("https://nike.com"); // open the url

        System.out.println(driver.getTitle()); // returns the title of the page
        //Nike. Just Do It. Nike FR
        System.out.println(driver.getCurrentUrl());  // returns the url of the page
         //https://www.nike.com/fr/
       String text= driver.findElement(By.id("hf_title_signin_membership")).getText();
        System.out.println(text);

        driver.navigate().to("https://ebay.com");

        driver.navigate().back();

        driver.navigate().forward();
        System.out.println(driver.getTitle());
         //Electronics, Cars, Fashion, Collectibles & More | eBay
        driver.navigate().refresh();

       driver.close ();





    }
}
