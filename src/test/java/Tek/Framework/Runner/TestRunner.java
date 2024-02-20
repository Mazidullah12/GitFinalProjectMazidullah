package Tek.Framework.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "Tek.Framework.Steps",
        tags = "@Regression",
        plugin = {
                "html:target/cucumber_report/report.html"
        }
)
public class TestRunner {
}
