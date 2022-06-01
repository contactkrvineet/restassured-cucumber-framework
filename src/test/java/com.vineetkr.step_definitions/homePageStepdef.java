package com.vineetkr.step_definitions;

import com.vineetkr.pages.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class homePageStepdef {
    HomePage homepage=new HomePage();

    @When("I choose to Login")
    public void i_choose_to_login(){

        homepage.loginFunction();

        System.out.println("Test2");
        // Write code here that turns the phrase above into concrete actions

    }
}
