package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

    public MainPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='withoutAnydata']/../following-sibling::span/a[2]/span[1]")
    public WebElement threeDotsOfWithoutAnyData;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addToFavourites;

    @FindBy(xpath = "//span[.='Favorited']/preceding-sibling::span")
    public WebElement addedToFavourites;




    @FindBy(xpath = "(//span[@class=\'fileactions\'])[5]/a[2]")
    public WebElement fifthElementThreeDots;

    @FindBy(xpath = "//a[@data-action='Rename']")
    public WebElement renameButton;

    @FindBy(xpath = "//span[.='test']")
    public WebElement fileNameTest;



    @FindBy(xpath = "//a[@class='menu-option option-details']")
    public WebElement detailsButton;

    @FindBy(id = "commentsTabView")
    public WebElement commentsButton;

    @FindBy(className= "message")
    public WebElement textBoxComments;

    @FindBy(xpath = "(//a[@class='action more icon icon-more has-tooltip'])[1]")
    public WebElement threeDotsInComments;

    @FindBy(xpath = "//span[.='Delete comment']")
    public WebElement deleteCommentButton;



}