package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(
		features = "D:\\eclipsprograms\\JPETSTORE_PROJECT\\src\\main\\resources\\feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc02_addtocart"},
		glue = {"com.stepdefinition"},
		monochrome = true
		)
public class addtocart_runner {

}
