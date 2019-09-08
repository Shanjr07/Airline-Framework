package com.Airline.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",glue="com.Airline.stepdefinition",plugin="html:target")
public class Testrunner {
	

}
