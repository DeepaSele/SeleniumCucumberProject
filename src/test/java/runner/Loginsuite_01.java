package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests; // what this import mean: this is for Testng file 
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features="features/CRMapplication.feature", glue="stepDefinition",
                  plugin = {"html:target/cucumber-html-report"})

public class Loginsuite_01 extends AbstractTestNGCucumberTests {

}
