package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BasicAmazonlogin.feature",
                   glue= {"StepDefinition"},
                   plugin= {"pretty","html:Reports/CucumberHtmlReport.html"},
                   monochrome=true, dryRun=true)

public class BaseLoginRunner {

}
