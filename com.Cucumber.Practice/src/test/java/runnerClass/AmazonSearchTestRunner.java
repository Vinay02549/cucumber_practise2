package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/AmazonSearch.feature",
					 glue = { "StepDefinition","myHooks"}, 
					 plugin = { "pretty","html:Reports/CucumberHtmlReport.html"}, 
					 tags = "@Smoke or @Regression",
					 monochrome = true, dryRun = true)

public class AmazonSearchTestRunner {

}
