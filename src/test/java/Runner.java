import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        glue = "stepdefinitions",
        features = "src/test/features/")
public class Runner {
    public static void main(String[] args) {
        JUnitCore jUnit = new JUnitCore();
        jUnit.run(Runner.class);
    }
}

