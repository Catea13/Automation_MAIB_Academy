package Steps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/Features/Login.feature",glue= {"Steps"})

public class TestRun {
}
