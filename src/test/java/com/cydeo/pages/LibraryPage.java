package com.cydeo.pages;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryPage {
    public LibraryPage(){
        PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement searchBox;

    @FindBy (id="inputPassword")
    public WebElement Password;


    @FindBy (xpath = " //button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement Button;


    @FindBy (xpath = " //li[@class= 'nav-item dropdown']")
    public WebElement dropdownButton;


    @FindBy(xpath = " //a[@class='dropdown-item']")
    public WebElement logout;

}
