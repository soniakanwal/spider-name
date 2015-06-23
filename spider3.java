package spider3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class spider3
{
   public static void main(String[] args)
   {
      WebDriver driver = new FirefoxDriver();
      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //Launch website
      driver.navigate().to("http://www.shophive.com/apple/mac?p=");
      
      //Maximize the browser
      driver.manage().window().maximize();
      
      // Get the Result Text based on its xpath
      WebElement result = driver.findElement(By.xpath("//div[1]/ol/li/a"));
      
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      
      //Close the Browser.
      driver.close();
   }
}