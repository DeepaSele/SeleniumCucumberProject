package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests; // what this import mean: this is for Testng file 
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features="features/WithCucumberOptions.feature", 
                  glue= "stepDefinition",//the path of the steps where the BDD is matched
                  dryRun=false, //to check the mapping is proper between feature file and step def file 
                  monochrome = true,  //This will generate the console output in a pretty or proper readable format
//                format = {"pretty","html:test-outout","json:json_output/cucumber.json"} This Format key is now not available in Cucumber
               strict = true //All the steps have written correctly.If we miss any step in report shows pls implement me
                  
)
 
 

public class Loginsuite_03_WithCucumberOptions extends AbstractTestNGCucumberTests{

}
