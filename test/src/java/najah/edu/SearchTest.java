package najah.edu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"use_cases/report.feature"},
		glue = { "najah.edu"},
		//tags = "@Smoke or @Regression",
		plugin = {"pretty"}
		
		)
public class SearchTest {

}
