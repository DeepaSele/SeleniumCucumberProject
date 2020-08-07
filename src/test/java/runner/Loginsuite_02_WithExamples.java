package runner;
 

import io.cucumber.testng.AbstractTestNGCucumberTests; // what this import mean: this is for Testng file 
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features="features/WithExamples.feature", glue="stepDefinition",
                  plugin = {"html:target/cucumber-html-report"})

 

public class Loginsuite_02_WithExamples extends AbstractTestNGCucumberTests {

}
