package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

    public MainPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@data-action='menu'])[1]/span[1]")
    public WebElement threeDotsOfFolder;

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addToFavourites;

    @FindBy(xpath = "//span[.='Favorited']/preceding-sibling::span")
    public WebElement addedToFavourites;

    @FindBy(xpath = "//a[@data-action='Rename']")
    public WebElement renameButton;

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