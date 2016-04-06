package Firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ryan.padwe on 4/6/2016.
 */
public class FirefoxBrowserExecution {

    public static void main(String[] args)

    {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://ryanp.ellucid.com");

        System.out.println(driver.getTitle());

    }


}
