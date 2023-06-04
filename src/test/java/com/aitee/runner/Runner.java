package com.aitee.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"rerun:ReRun/failed_run.txt","pretty","html:Reports/cucumber.html","json:Reports/cucumber.json"}, features = {"./src/test/resources/feature/"},glue = {"com.aitee.stepdefenition"},monochrome = true,publish =true,dryRun = true,snippets = SnippetType.CAMELCASE,tags = "")
public class Runner {

}
