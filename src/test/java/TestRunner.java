import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
        features = {"classpath:features"},
        tags = "@MountainBike"
)


public class TestRunner extends AbstractTestNGCucumberTests {

}
