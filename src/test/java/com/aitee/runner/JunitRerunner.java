package com.aitee.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"@ReRun/failed_run.txt"},glue = {"com.aitee.stepdefenition"})
public class JunitRerunner {		

}
