package com.amazon.testrunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.CucumberOptions;

@CucumberOptions(
		
	features = "D:\\Complete_Project\\CucumberFramework\\src\\main\\java\\com\\amazon\\features\\feature",
	glue = {"com\\amzon\\stepdefinition"},
	format = {"pretty","html:test-output"},
	dryRun = false,
	monochrome = true,
	strict = true
		
		)

public class TestRunner {
	
	private cucumber.api.testng.TestNGCucumberRunner TestNGCucumberRunner;
	
	@BeforeClass(alwaysRun=true)
	public void getsetup()
	{
		TestNGCucumberRunner = new cucumber.api.testng.TestNGCucumberRunner(this.getClass());
	}
	
	@Test(groups = "Test", description="Cucumber Framework", dataProvider = "feature")
	public void feature(CucumberFeatureWrapper cucumberfeature)
	{
		TestNGCucumberRunner.runCucumber(cucumberfeature.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][] feature()
	{
		return TestNGCucumberRunner.provideFeatures();
	}
	
	@AfterClass(alwaysRun=true)
	public void teardown()
	{
		TestNGCucumberRunner.finish();
	}
	
	

}
