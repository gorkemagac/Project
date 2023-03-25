package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MainPage {

    public MainPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='withoutAnydata']/../following-sibling::span/a[2]/span[1]")
    public WebElement threeDotsOfWithoutAnyData;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addToFavourites;

    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement removeFromFavorites;

    @FindBy(xpath = "//span[.='Favorited']/preceding-sibling::span")
    public WebElement addedToFavourites;

   //@FindBy(xpath = "(//span[@class=\'fileactions\'])[5]/a[2]")
   @FindBy(xpath = "//tr[@data-file='RW.txt']//a[2]")
    public WebElement rWFileThreeDots;

    @FindBy(xpath = "//tr[@data-file='test.txt']//a[2]")
    public WebElement testFileThreeDots;


    @FindBy(xpath = "//a[@data-action='Rename']")
    public WebElement renameButton;

    @FindBy(xpath = "//span[.='test']")
    public WebElement fileNameTest;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement detailsButton;

    @FindBy(id = "commentsTabView")
    public WebElement commentsButton;

    @FindBy(className= "message")
    public WebElement textBoxComments;

    @FindBy(xpath= "(//div[.='comment test'])[1]")
    public WebElement enteredComment;

    @FindBy(xpath = "(//div[.='comment test'])[1]/preceding-sibling::div/a")
    public WebElement threeDotsInComments;

    @FindBy(xpath = "//span[.='Delete comment']")
    public WebElement deleteCommentButton;

    @FindBy(xpath = "(//div[.='comment test'])[1]")
    private List<WebElement> commentTestElements;

    // Define a constructor that initializes the Page Factory
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Define a method to check if the element is present on the page
    public boolean isCommentTestElementPresent() {
        return commentTestElements.size() > 0;
    }



}