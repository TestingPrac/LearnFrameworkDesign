package cucum;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",
        glue = {"testDefinition"}, dryRun = false,
        plugin = {"html:target/cucumber-report.html"},
        tags = "@Pega_Regression_CC_PN-9589_TC01", monochrome = true)

public class Testrunner {



}
