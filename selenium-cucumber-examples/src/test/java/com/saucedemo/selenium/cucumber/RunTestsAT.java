package com.saucedemo.selenium.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"pretty"}, features = "src/test/resources")
public class RunTestsAT extends AbstractTestNGCucumberTests{
}
