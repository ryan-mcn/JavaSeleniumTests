package IE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by ryan.padwe on 4/6/2016.
 */
public class IEBrowserExecution {

    public static void main(String[] args)

    {

        System.setProperty("webdriver.ie.driver", "C:\\SeleniumDrivers\\IEDriverServer.exe");

        WebDriver driver=new InternetExplorerDriver();

        driver.get("ryanp.ellucid.com");

        System.out.println(driver.getTitle());


    }


}
