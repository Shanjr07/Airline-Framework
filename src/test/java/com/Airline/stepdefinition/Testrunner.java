package com.Airline.stepdefinition;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",glue="com.Airline.stepdefinition",
plugin= {"pretty","html:target/cucumber.html" ,
    "json:target/cucumber.json" ,
    "junit:target/cucumber.xml"},dryRun=false,monochrome=true)
public class Testrunner {
	

}
