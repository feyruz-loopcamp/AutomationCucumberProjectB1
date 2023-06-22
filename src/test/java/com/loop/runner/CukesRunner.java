package com.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features",
        glue = "com/loop/step_definitions",
        dryRun = false,
        tags = "@wip",
        monochrome = true
)
public class CukesRunner {
}
