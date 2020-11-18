package smokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Testbase;

public class HoverAction extends Testbase {
  @Test
    public void  action(){


    WebElement ele=driver.findElement(By.xpath("//*[0test='xpath']"));
      //Create object 'action' of an Action class
    Actions action = new Actions(driver);
    //Mouseover on  an element
    action.moveToElement(ele).perform();
  }
    //If we want to click on the sub-element,
    // first we need to mouse hover on the parent-element and then sub-element and click on it
  @Test
  public void action2(){
    // Main menu
    WebElement mainMenu= driver.findElement(By.linkText("main_menu_link"));
    // Create object action of an Action class
    Actions actions =new Actions(driver);
    //to mouseover on main menu
    actions.moveToElement(mainMenu);

    //sub menu
    WebElement subMenu = driver.findElement(By.linkText("sub_meu_link"));
    //to mouseover on sub menu
    actions.moveToElement(subMenu);
    //build() method is used to compile all the actions into a single step
    actions.click().build().perform();
    //note :Or moving to the main menu and then sub menu and clicking on it using object of the Actions class
  //action.moveToElement(mainMenu).moveToElement(driver.findElement(By.linkText("sub_menu_link"))).click().build().perform();



  }
}
