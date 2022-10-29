package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class StudentLibrarianPage {

     public StudentLibrarianPage(){
         PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(), this);
     }



        @FindBy(id = "inputEmail")
        public WebElement searchBox;

        @FindBy (id="inputPassword")
        public WebElement Password;


        @FindBy (xpath = " //button[@class='btn btn-lg btn-primary btn-block']")
        public WebElement Button;

         @FindBy(xpath = "//span[.='Users']")
         public WebElement usersLink;

        @FindBy (id="navbarDropdown")
        public WebElement dropdownButton;


        @FindBy(xpath = " //a[@class='dropdown-item']")
        public WebElement logout;




    }




