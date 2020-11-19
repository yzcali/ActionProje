package smokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Testbase;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks extends Testbase {

    @Test
    public void BLTest01() throws InterruptedException {

        driver.get("https://www.ebay.com");
        Thread.sleep(3000);
        //Used tagName method to collect the list of items with tagName "a"
        //findElements - to find all the elements with in the current page. It returns a list of all WebElements or an empty list if nothing matches

        List<WebElement> links = driver.findElements(By.tagName("a"));
        //To print the total number of links
        System.out.println("Total links are "+ links.size());
        //used for loop to
        for(int i= 0; i< links.size(); i++){
            WebElement element = links.get(i);
            //By using "href" attribute, we could get the url of the requried link
            String url = element.getAttribute("href");
            //calling verifyLink() method here. Passing the parameter as url which we collected in the above link
            //See the detailed functionality of the verifyLink(url) method below
           verifyLink(url);


        }



    }

    private void verifyLink(String urlLink) {

        try{
            //Use URL Class - Create object of the URL Class and pass the urlLink as parameter
      URL link = new URL(urlLink);
            // Create a connection using URL object (i.e., link)
            HttpsURLConnection httpCon = (HttpsURLConnection)link.openConnection();
            //Set the timeout for 2 seconds
            httpCon.setConnectTimeout(2000);
            //connect using connect method
            httpCon.connect();
            //use getResponseCode() to get the response code.

         if (httpCon.getResponseCode()== 200){
             System.out.println(urlLink+ " - "+ httpCon.getResponseMessage());
         }
         if (httpCon.getResponseCode() == 404){
             System.out.println(urlLink+ " - "+ httpCon.getResponseMessage());
         }

            //getResponseCode method returns = IOException - if an error occurred connecting to the server.


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
