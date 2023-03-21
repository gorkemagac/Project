package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;

public class AddToFavourites {

    MainPage mainPage = new MainPage();

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
    public void file_is_added_to_the_favourites() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(mainPage.addedToFavourites.isDisplayed());
    }



}