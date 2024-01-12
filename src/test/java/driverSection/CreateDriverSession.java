package driverSection;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDriverSession {

    public static WebDriver driver;



    @Before
    public void beforeScenario() {
        driver = new ChromeDriver();

    }


    @After
    public void afterScenario() {
        driver.quit();
    }

}
