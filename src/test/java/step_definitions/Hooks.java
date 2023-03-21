
package step_definitions;



import io.cucumber.java.*;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {
    LoginPage loginPage = new LoginPage();

    @Before
    public void loginToTheSystem()
    {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginbutton.click();
    }
}

