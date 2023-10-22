package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "D:\\Eclipse\\Udemy-GreenKart\\src\\test\\java\\feature\\greenKart.feature",
        glue = "stepDefination", monochrome = true, plugin = {}, dryRun = false)


public class TestNGRunner extends AbstractTestNGCucumberTests {
}
