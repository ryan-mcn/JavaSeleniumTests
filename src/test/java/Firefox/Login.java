package Firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ryan.padwe on 4/6/2016.
 */
public class Login {

    public static void main (String[] args)
    {
//Initial Load
        WebDriver driver = new FirefoxDriver();

//Unsuccessful Login UN

        driver.get("https://ryanp.ellucid.com");

        WebElement query = driver.findElement(By.name("sname"));

        query.sendKeys("test.user000");

        query = driver.findElement(By.name("spwd"));

        query.sendKeys("Testing0!");

        driver.findElement(By.id("loginButton")).click();



//Unsuccessful Login PW
        driver.get("https://ryanp.ellucid.com");

        query = driver.findElement(By.name("sname"));

        query.sendKeys("test.user");

        query = driver.findElement(By.name("spwd"));

        query.sendKeys("Testing");

        driver.findElement(By.id("loginButton")).click();



//Successful Login Test

        driver.get("https://ryanp.ellucid.com");

        query = driver.findElement(By.name("sname"));

        query.sendKeys("test.user");

        query = driver.findElement(By.name("spwd"));

        query.sendKeys("Testing0!");

        driver.findElement(By.id("loginButton")).click();

        assert (driver.getTitle().equals("Test User: Home Menu Selection"));




    }

}
