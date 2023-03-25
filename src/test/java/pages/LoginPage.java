
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {


    public LoginPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="user")
    public WebElement username;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id="submit-form")
    public WebElement loginbutton;


    public void login()
    {
        this.username.sendKeys("Employee31");
        this.password.sendKeys("Employee123");
         this.loginbutton.click();
    }

}
