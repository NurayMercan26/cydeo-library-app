package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user can on the login page")
    public void user_can_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoLibrary.url"));
    }


    @When("user enter librarian username")
    public void user_enter_librarian_username() {
        loginPage.searchBox.sendKeys("librarian5@library");
    }
    @When("user enter librarian password")
    public void user_enter_librarian_password() {
        loginPage.Password.sendKeys("hj65YBiE");
    }

    @When("user have to click button")
    public void user_have_to_click_button() {
        loginPage.Button.click();
    }
    @When("user clicks dropdown")
    public void user_clicks_dropdown() {
        loginPage.dropdownButton.click();
    }
    @When("user can logout dashboard")
    public void user_can_logout_dashboard() {
        loginPage.logout.click();
    }
    @Then("user  sees the dashboard")
    public void user_sees_the_dashboard() {
        System.out.println("user should see the dashboard");
    }

    @When("user enter student username")
    public void user_enter_student_username() {
        loginPage.searchBox.sendKeys("student7@library");
    }
    @When("user enter student password")
    public void user_enter_student_password() {
        loginPage.Password.sendKeys("QfYjDNXj");

    }

    @When("user  must click button")
    public void user_must_click_button() {
       loginPage.Button.click();
    }

    @Then("user see the dashboard")
    public void user_see_the_dashboard() {
        System.out.println("user should see the dashboard");
    }
}
