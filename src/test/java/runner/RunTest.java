package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/createLead.feature",
				glue="steps",
				monochrome=true
				// To methods without creation
				//dryRun=true,
				//snippets=SnippetType.CAMELCASE
				)
public class RunTest extends AbstractTestNGCucumberTests{

}
