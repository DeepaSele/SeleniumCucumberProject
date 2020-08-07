package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests; // what this import mean: this is for Testng file 
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features="features/CRMapplication.feature", glue="stepDefinition")
public class Loginsuite_04_WithDataTables extends AbstractTestNGCucumberTests {

}
