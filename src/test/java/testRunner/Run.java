package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//Features/Login_Morning.feature",".//Features/SearchCustomer.feature"},
		glue="stepDefinitions",
		dryRun=true,
		monochrome=true,
		tags="@Smoke or @Sanity",
		plugin= {"pretty","html:target/Cucumber-Reports/HtmlReport.html",
				"json:target/Cucumber-Reports/JSONReport.json",
				"junit:target/Cucumber-Reports/XMLReport.xml",
				"pretty:target/Cucumber-Reports/TextReport.txt"}
		
		)
public class Run {

}
