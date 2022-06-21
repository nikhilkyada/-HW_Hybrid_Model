package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    VerifyRegisterSuccess verifyRegisterSuccess = new VerifyRegisterSuccess();


    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    //Category

    @Given("User is on homepage")
    public void user_is_on_homepage() {

    }
    @When("User click on {string} link from top menu header")
    public void user_click_on_link_from_top_menu_header(String category_name) {
        homePage.clickOnComputer(category_name);

    }
    @Then("User should be navigated to related {string} category page successfully")
    public void user_should_be_navigated_to_related_category_page_successfully(String category_url) {
    Utils.driverWaitUrlToBe(category_url,5);
    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    //Registration

    @Given("user is on registration page")
    public void userIsOnRegistrationPage() {
        homePage.clickOnRegister();
        registrationPage.verifyRegistrationPageURL();
    }
    @When("user enter all required fields")
    public void userEnterAllRequiredFields() {

        registrationPage.enterAllRegistrationDetails();
    }

    @And("click on Register Button")
    public void clickOnRegisterButton() {
        registrationPage.clickOnRegisterBtn();
    }

    @Then("user should be able to see success message")
    public void user_should_be_able_to_see_success_message() {
        verifyRegisterSuccess.verifyRegistrationSuccess();
        verifyRegisterSuccess.clickOnContinue();
    }



}
