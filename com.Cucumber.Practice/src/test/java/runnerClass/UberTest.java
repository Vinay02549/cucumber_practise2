package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/uber.feature",
					 glue = {"StepDefinition","myHooks"}, 
					 plugin = {"pretty", 
							 "json:target/MyReports/report.json",
							"junit:target/MyReports/report.xml"},
			
					// tags = "not @Regression and @Smoke or @Prod",
					 tags = "@All",
					 monochrome = true, dryRun = true
					 )

public class UberTest {

}
