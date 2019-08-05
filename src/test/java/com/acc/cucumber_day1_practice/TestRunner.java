package com.acc.cucumber_day1_practice;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"step_definition"},plugin = {"json:target/cucumber.json"}
		)

public class TestRunner {

}
