package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)     // Cucumber.class it is by default class we have to give no need to create new class
@CucumberOptions(
		features="C:/Users/DELL/API_BBD/src/test/java/feature",
		glue="stepDefinations",
		tags= "@AddPlace"
		//publish = true,
		//monochrome=true,
		//dryRun=false
		
		
		
				)

public class TestRunner {

}
