package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "C:\\Users\\DELL\\Desktop\\Facebook Cucumber\\Facebook\\src\\test\\java\\facebbok.feature",
		glue = "StepDefinition",
		dryRun = false,
		monochrome = true,
		tags = "@Regression",
		plugin = {"pretty","html:target/cucumber-projects/reports1_html.html"}
		)

public class testrunner 
{
	

}
