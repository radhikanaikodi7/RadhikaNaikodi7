package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;



	@RunWith(Cucumber.class)
	@io.cucumber.junit.CucumberOptions(
			features = "/Users/Kriyansh/eclipse-workspace/RadhikaLabCorpBDD/src/main/java/Features/Search.feature",
			glue={"StepDefination"}, //the path of the step definition files
			//format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
public class SearchRunner {

}


	

	
