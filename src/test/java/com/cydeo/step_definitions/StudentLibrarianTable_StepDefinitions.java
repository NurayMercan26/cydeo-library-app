package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.StudentLibrarianPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class StudentLibrarianTable_StepDefinitions {

   StudentLibrarianPage studentLibrarianPage = new StudentLibrarianPage();


    @Given("user enter on the login page")
    public void user_enter_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoLibrary.url"));
    }
    @When("student enters username {string}")
    public void student_enters_username(String searchBox) {
        studentLibrarianPage.searchBox.sendKeys(searchBox);
    }
    @When("student enters password {string}")
    public void student_enters_password(String Password) {
        studentLibrarianPage.Password.sendKeys(Password);

    }
    @When("student clicks sign in button")
    public void student_clicks_sign_in_button() {
        studentLibrarianPage.Button.click();
    }

    @When("student  should be able to see homepage")
    public void student_should_be_able_to_see_homepage() {
       studentLibrarianPage.usersLink.click();
       WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);wait.until(ExpectedConditions.urlContains("books"));

       Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("books"));

    }
    @Then("student logout")
    public void student_logout() {
        studentLibrarianPage.dropdownButton.click();
        studentLibrarianPage.logout.click();


    }
    @Then("tables should have following columns")
    public void tablesShouldHaveFollowingColumns() {

    }


    @Given("users is  enter on the login page")
    public void users_is_enter_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoLibrary.url"));
    }


    @When("librarian is enter username {string}")
    public void librarian_is_enter_username(String searchBox) {
       studentLibrarianPage.searchBox.sendKeys(searchBox);
    }
    @When("librarian is  enter password {string}")
    public void librarian_is_enter_password(String Password) {
        studentLibrarianPage.Password.sendKeys(Password);
    }
    @When("librarian is click sign in button")
    public void librarian_is_click_sign_in_button() {
        studentLibrarianPage.Button.click();
    }

    @When("student  should be able to see homepage {string}")
    public void student_should_be_able_to_see_homepage(String usersLink ) {
        studentLibrarianPage.usersLink.sendKeys();
    }
    @When("librarian user should be able to see dashboard {string}")
    public void librarian_user_should_be_able_to_see_dashboard(String usersLink) {
        studentLibrarianPage.usersLink.sendKeys();

    }
    @Then("librarian logout")
    public void librarian_logout() {
        studentLibrarianPage.dropdownButton.click();
        studentLibrarianPage.logout.click();



    }



}
