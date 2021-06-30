package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuyingProduct {
    @And("^I sort the product in A to Z list$")
    public void iSortTheProductInAToZList() throws InterruptedException {
        Thread.sleep(1000);
        new ComputerPage().selectPositionFromDropdown(1);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnAddToCart();

    }

    @Then("^I should navigate to build your own page$")
    public void iShouldNavigateToBuildYourOwnPage() throws InterruptedException {
        Thread.sleep(1000);
        String expectedMessage = "Build your own computer";
        String actualMessage = new BuildYourOwnComputerPage().buildYourOwnComputerText();
        Assert.assertEquals(expectedMessage, actualMessage);


    }

    @And("^I select the processor from dropdown$")
    public void iSelectTheProcessorFromDropdown() throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().setSelectProcessorFromDropDownMenu(1);
    }

    @And("^I select the ram from dropdown$")
    public void iSelectTheRamFromDropdown() throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().setSelectRam(3);
    }

    @And("^I click on Hdd radio <\"([^\"]*)\">$")
    public void iClickOnHddRadio(String Hdd) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnHdd(Hdd);

    }

    @And("^I click on os vista premium radio button<\"([^\"]*)\">$")
    public void iClickOnOsVistaPremiumRadioButton(String os) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnOsRadio(os);

    }

    @And("^I click on software microsoftoffice checkbox<\"([^\"]*)\">$")
    public void iClickOnSoftwareMicrosoftofficeCheckbox(String software1) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnMicroSoftOffice(software1);

    }

    @And("^I click on total commander checkbox<\"([^\"]*)\">$")
    public void iClickOnTotalCommanderCheckbox(String software2) throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnSoftwareTotalCommander(software2);
    }

    @Then("^I verify that amount in total price$")
    public void iVerifyThatAmountInTotalPrice() throws InterruptedException {
        Thread.sleep(1000);
        String expectedMessage1 = "$1,475.00";
        String actualMessage1 = new BuildYourOwnComputerPage().setVerifyPrice();
        Assert.assertEquals(actualMessage1, expectedMessage1);

    }

    @When("^I click on add to cart for product$")
    public void iClickOnAddToCartForProduct() throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().setClickAddCartButton();
    }

    @Then("^I should see the message that product successfully added to cart$")
    public void iShouldSeeTheMessageThatProductSuccessfullyAddedToCart() throws InterruptedException {
        Thread.sleep(1000);
        String expectedMessage2 = "The product has been added to your shopping cart";
        String actualMessage2 = new BuildYourOwnComputerPage().verifyShoppingCartText();
        Assert.assertEquals(expectedMessage2, actualMessage2);


    }

    @Then("^I click on display popup message$")
    public void iClickOnDisplayPopupMessage() throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().clickOnCrossGreenBar();
    }

    @Given("^I am mousehover on  computer link$")
    public void iAmMousehoverOnComputerLink() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().mouseHoverOnComputerLink();
    }
}
