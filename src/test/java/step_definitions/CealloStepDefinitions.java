package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CealloStepDefinitions {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the page and logged in")
    public void user_is_on_the_page_and_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login();
    }

  @When("user clicks three dots of the file")
    public void user_clicks_three_dots_of_the_file() {
        // Write code here that turns the phrase above into concrete actions
        mainPage.threeDotsOfWithoutAnyData.click();

    }
    @When("clicks Add to Favourites button")
    public void clicks_add_to_favourites_button() {
        // Write code here that turns the phrase above into concrete actions
        mainPage.addToFavourites.click();
    }
    @Then("file is added to the favourites")
    public void file_is_added_to_the_favourites() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(mainPage.addedToFavourites.isDisplayed());
        mainPage.threeDotsOfWithoutAnyData.click();
        mainPage.removeFromFavorites.click();
    }

    @When("clicks Details button")
    public void clicks_details_button() {
        // Write code here that turns the phrase above into concrete actions
        mainPage.detailsButton.click();

    }
    @When("clicks Comments button")
    public void clicks_comments_button() {
        // Write code here that turns the phrase above into concrete actions
        mainPage.commentsButton.click();
    }
    @When("types {string} to the input box and hits enter")
    public void types_to_the_input_box_and_hits_enter(String comment) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        mainPage.textBoxComments.click();
        mainPage.textBoxComments.sendKeys(comment + Keys.ENTER);

    }
    @Then("{string} is added to the file")
    public void is_added_to_the_file(String comment) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        String expectedComment = comment;
        String actualComment = mainPage.enteredComment.getText();
        Assert.assertEquals(expectedComment,actualComment);


    }
    @When("clicks three dots of the comment test comment")
    public void clicks_three_dots_of_the_comment_test_comment() {
        // Write code here that turns the phrase above into concrete actions

        mainPage.threeDotsInComments.click();
    }
    @When("clicks Delete comment button")
    public void clicks_delete_comment_button() {
        // Write code here that turns the phrase above into concrete actions
        mainPage.deleteCommentButton.click();
    }

    @Then("comment test comment gets deleted")
    public void comment_test_comment_gets_deleted() {
        // Write code here that turns the phrase above into concrete actions
        //Driver.getDriver().findElements(By.xpath("(//div[.='comment test'])[1]")).size() > 0;
        boolean isElementPresent = mainPage.isCommentTestElementPresent();
        Assert.assertTrue(isElementPresent);



    }
    @When("user clicks three dots of a file")
    public void user_clicks_three_dots_of_a_file() {
        // Write code here that turns the phrase above into concrete actions
        mainPage.rWFileThreeDots.click();
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
    public void file_name_is_changed_to(String testFile) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        String expectedFileName = testFile;
        String actualFileName = mainPage.fileNameTest.getText();

        Assert.assertEquals(expectedFileName,actualFileName);

        Thread.sleep(3000);
        mainPage.testFileThreeDots.click();
        mainPage.renameButton.click();

        WebElement activeElement = Driver.getDriver().switchTo().activeElement();
        activeElement.sendKeys("RW" + Keys.ENTER);




    }

}