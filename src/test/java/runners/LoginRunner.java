package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features="classpath:features", //path of feature
		glue="steps", //package name
		tags="@DbScenario1",
		monochrome=true, // true monochrome works together with pretty to make the console readable more clearly
		dryRun=false,    // true dryRun, stops running the codes and checks the major problems
		plugin = {
				"pretty",  // the report in console
				"html:target/cucumber",  // this is report under target/cucumber
				"json:target/cucumber.json" // this is report under target cucumber.json
											// there is option to convert to htm sandwich report but we have to pay for it
		}
		)

public class LoginRunner {

}

