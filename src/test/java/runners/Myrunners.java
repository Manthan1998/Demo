package runners;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\training_d2.03.07\\eclipse-workspace\\Cucumber_demo1\\Myfeature\\tagsdemo.feature", glue ="tagsdemo.feature", tags= {"@smoke,@uat"})
public class Myrunners {

}
