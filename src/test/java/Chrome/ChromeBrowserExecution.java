package Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ryan.padwe on 4/6/2016.
 */
public class ChromeBrowserExecution {

    public static void main(String[] args)

    {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://ryanp.ellucid.com");

        System.out.println(driver.getTitle());


    }

}
