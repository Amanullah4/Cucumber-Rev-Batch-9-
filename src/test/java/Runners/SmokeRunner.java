package Runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Dashboard.feature",
        //glue is where we can find implementations for gherkin steps
        // we provide the path of package for steps
        glue = "Steps",
        //if we set dry run to true, it will quickly scan all gherkin steps are implemented or not
        // if it is true, then no actual execution happens
        dryRun = false,
        //it means that the console output for the cucumber test is easily readable
        //it will remove unreadable character
        monochrome = true,
        //if strict is set to true then at the time of execution if cucumber encounters any undefined
        //steps, it will give an error and stops execution. Also it gives code snippet for the
        //unimplemented steps

        tags = "@dashboardtabs",
        //tags will identify the scenarios based on the tags we will provide such as @smoke, @regression etc
        // we can add multiple tags in the runner class to execute scenarios belong to different tags such
        //as and or ,
        //plugin = {"html:target/cucumber.html"}
        //it makes and html report that you can open it by any browser
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
        //prints the spteps in consule. which steps are used.
)

public class SmokeRunner {
}