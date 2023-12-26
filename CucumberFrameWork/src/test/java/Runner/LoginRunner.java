package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/windows/eclipse-workspace/CucumberFrameWork/src/test/resources/FeatureFiles",glue= {"StepDefinition"})
public class LoginRunner
{
	
}
