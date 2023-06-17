package com.loop.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.loop.utilities.*;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @Before
    public void setup(){
        Driver.getDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        // only takes a screenshot if the scenario fails
        if (scenario.isFailed()) {
            // taking a screenshot
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
           // scenario.embed(screenshot, "image/png");
        }
        Driver.closeDriver();
    }

}
