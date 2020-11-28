package StepRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "./BDD/com/qa/Feature/nivar.feature",
glue = {"com/qa/StepDefinition"},
plugin = {"html:test-output", "pretty"},
monochrome = true,
strict = true,
dryRun = false)

public class NivarSR extends AbstractTestNGCucumberTests{
	
}
