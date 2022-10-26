package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.SearchTablePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchTable_StepDefinitions {

    LoginPage loginPage =new LoginPage();
    SearchTablePage searchTablePage = new SearchTablePage();


    @Given("librarian is on the login page")
    public void librarian_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoLibrary.url"));
    }

    @When("librarian enters username {string}")
    public void librarian_enters_username(String searchBox) {
        loginPage.searchBox.sendKeys(searchBox);
    }

    @When("librarian  enter password {string}")
    public void librarian_enter_password(String Password) {
        loginPage.Password.sendKeys(Password);
    }


    @When("click sign in button")
    public void click_sign_in_button() {
        loginPage.Button.click();
    }

    @When("user click users page button")
    public void user_click_users_page_button() {
         loginPage.usersLink.click();
    }


    @Then("table should have following columns")
    public void table_should_have_following_columns(List<String>element) {


        List<WebElement> titles = new ArrayList<>();
        searchTablePage.total (titles);

        for (int i = 0; i < element.size(); i++) {
            Assert.assertEquals(element.get(i), titles.get(i).getText());
        }

    }

}
