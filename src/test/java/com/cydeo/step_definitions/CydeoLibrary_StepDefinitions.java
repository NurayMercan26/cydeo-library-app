package com.cydeo.step_definitions;

import com.cydeo.pages.LibraryPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.SQLOutput;

public class CydeoLibrary_StepDefinitions {
      LibraryPage libraryPage =new LibraryPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoLibrary.url"));
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
      libraryPage.searchBox.sendKeys("librarian1@library");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
     libraryPage.Password.sendKeys("qU9mrvur");
    }
    @Then("user can see the dashboard")
    public void user_can_see_the_dashboard() {
      libraryPage.Button.click();
        System.out.println("User should see the dashboard");

    }


    @Then("user click dropdown")
    public void user_click_dropdown() {
        libraryPage.dropdownButton.click();
    }

    @Then("user logout dashboard")
    public void user_logout_dashboard() {
     libraryPage.logout.click();
    }

    @When("user enters student username")
    public void user_enters_student_username() {
     libraryPage.searchBox.sendKeys("student3@library");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
      libraryPage.Password.sendKeys("rPjgZ86a");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        libraryPage.Button.click();
        System.out.println("user should see the dashboard");

    }
}
