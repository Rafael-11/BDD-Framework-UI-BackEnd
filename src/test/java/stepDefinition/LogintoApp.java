package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.homePage;
import utility.ConfigReader;
import utility.TestBase;

public class LogintoApp extends TestBase {

    homePage homePage = new homePage();




    @Given("user is already on on login page")
    public void user_is_already_on_on_login_page() {
        driver.navigate().to(ConfigReader.get("website"));
    }

    @When("I enters {string}")
    public void i_enters(String string) {
        homePage.userNameField.sendKeys(ConfigReader.get("username"));
    }
    @When("I click on {string}")
    public void i_click_on(String string) {
      homePage.PasswordField.sendKeys(ConfigReader.get("password"));
    }
    @Then("I should see {string}")
    public void i_should_see(String string) {
       homePage.loginBtn.click();
    }

}
