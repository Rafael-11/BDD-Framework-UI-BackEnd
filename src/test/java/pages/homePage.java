package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageUtility.BasePage;

public class homePage extends BasePage {



    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement PasswordField;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement loginBtn;
}
