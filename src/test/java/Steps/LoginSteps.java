package Steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.List;
import java.util.Map;

public class LoginSteps extends CommonMethods {


    @Given("user navigates to lms application")
    public void login() {//you can give any name in this methods
    setUp();
    }

    @When("user enters valid username and password")
    public void enterTeacherCredentiols() {

        LoginPage loginPage=new LoginPage();
        sendText(loginPage.userEmail, ConfigReader.getPropertyValue("username"));
        sendText(loginPage.password, ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        LoginPage loginPage=new LoginPage();
        click(loginPage.loginBtn);
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.logoutButton.isDisplayed());
    }

    @Then("logo and login text is displayed")
    public void logoValidation() {
        LoginPage login = new LoginPage();
      //  Assert.assertTrue(displayed(login.logo));

        String expectedText = "Dear user, log in to access the admin area!";
        String actual=login.loginText.getText();

        Assert.assertEquals("Text is not matched", expectedText,actual );
    }
}