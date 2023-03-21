package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.MainPage;
import utilities.Driver;

public class RenameAFile {

    MainPage mainPage = new MainPage();

    @When("user clicks three dots of a file")
    public void user_clicks_three_dots_of_a_file() {
        // Write code here that turns the phrase above into concrete actions
        mainPage.fifthElementThreeDots.click();
    }
    @When("clicks Rename button")
    public void clicks_rename_button() {
        // Write code here that turns the phrase above into concrete actions
        mainPage.renameButton.click();
    }

    @When("types {string} and hits enter")
    public void types_and_hits_enter(String testKeyword) {
        // Write code here that turns the phrase above into concrete actions
        WebElement activeElement = Driver.getDriver().switchTo().activeElement();
        activeElement.sendKeys(testKeyword + Keys.ENTER);

    }
    @Then("file name is changed to {string}")
    public void file_name_is_changed_to(String testFile) {
        // Write code here that turns the phrase above into concrete actions
        String expectedFileName = testFile;
        String actualFileName = mainPage.fileNameTest.getText();

        Assert.assertEquals(expectedFileName,actualFileName);

    }
}
