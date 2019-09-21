package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				dryRun = false,
				features = "src/test/resources/feature/google.feature", 
				glue = {"stepDefination"},
				plugin = { "pretty", "html:target/cucumber-reports", "json:target/cucumber.json" },
				monochrome = true)

public class cucumberRunner {

}
