package com.cts.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/features/DemoWebShop.feature"},
glue = {"com/cts/stepDefinitions"}, plugin = {"html:reports/"})

@RunWith(Cucumber.class)
public class TestRunner {
	
}
