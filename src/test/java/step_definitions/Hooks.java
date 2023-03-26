package step_definitions;

import io.cucumber.java.After;
import utilities.Driver;

public class Hooks {

    @After
    public void tearDownScenario()
    {
        Driver.closeDriver();
    }

}
