package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/Amazon order.feature"}, 
					glue = { "StepDefinition", "myHooks" }, 
					plugin = { "pretty", "html:Reports/CucumberHtmlReport.html", "rerun:target/failedrerun.txt"}, 
					monochrome = true, 
					dryRun = true
					)
public class AmazonOrderTest {

}
