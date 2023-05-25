package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/Features/login.feature",
        glue = {"StepsDefinitions"}
)
public class Run extends AbstractTestNGCucumberTests {
}
