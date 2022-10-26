package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginDifferent_StepDefinitions {

    LoginPage loginPage =new LoginPage();

    @Given("user go to  on the login page")
    public void user_go_to_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoLibrary.url"));


    }
    @When("librarian enter username {string}")
    public void librarian_enter_username(String  searchBox) {
       loginPage.searchBox.sendKeys(searchBox);
    }
    @When("librarian enter password {string}")
    public void librarian_enter_password(String Password) {
        loginPage.Password.sendKeys(Password);

    }
    @When("librarian click sign in button")
    public void librarian_click_sign_in_button() {
        loginPage.Button.click();
    }


    @When("librarian should be able see {string} users")
    public void librarian_should_be_able_see_users(String numbersUser) {
        BrowserUtils.waitForVisibilityOf(loginPage.userCount);

        String actualResult = loginPage.userCount.getText();
        //System.out.println(actualResult);

        Assert.assertEquals(numbersUser, actualResult);
        System.out.println("librarian should be able see 1245 users");
    }

    @When("librarian click dropdown")
    public void librarian_click_dropdown() {
        loginPage.dropdownButton.click();
    }

    @Then("librarian is logout")
    public void librarian_is_logout() {
      loginPage.logout.click();
    }


    @When("student enter username {string}")
    public void student_enter_username(String searchBox) {
        loginPage.searchBox.sendKeys(searchBox);

    }
    @When("student enter password {string}")
    public void student_enter_password(String Password) {
        loginPage.Password.sendKeys(Password);

    }
    @When("student click sign in button")
    public void student_click_sign_in_button() {
        loginPage.Button.click();
    }

    @Then("student should be see homepage")
    public void student_should_be_see_homepage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("books"));

        BrowserUtils.verifyURLContains("books");
        //Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("books"))
    }

}

