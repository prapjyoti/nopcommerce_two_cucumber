package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.TopMenuPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TopMenuTest {


    @When("^I click on computer link$")
    public void iClickOnComputerLink() throws InterruptedException {
        Thread.sleep(500);
        new TopMenuPage().selectMenu("Computers");
    }


    @Then("^I should navigate to computer page successfully$")
    public void iShouldNavigateToComputerPageSuccessfully() {

        String expectedMessage = "Computers";
        String actualMessage = new TopMenuPage().verifyComputerPages();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Then("^I should navigate to electronics page successfully$")
    public void iShouldNavigateToElectronicsPageSuccessfully() {
        String expectedMessage1 = "Electronics";
        String actualMessage1 = new TopMenuPage().verifyElectronicsPages();
        Assert.assertEquals(actualMessage1, expectedMessage1);
    }


    @When("^I click on electronics link then$")
    public void iClickOnElectronicsLinkThen() throws InterruptedException {
        Thread.sleep(500);
        new TopMenuPage().selectMenu("Electronics");
    }


    @When("^I click on Apparel link$")
    public void iClickOnApparelLink() throws InterruptedException {
        Thread.sleep(500);
        new TopMenuPage().selectMenu("Apparel");
    }

    @Then("^I should navigate apparel page successfully$")
    public void iShouldNavigateApparelPageSuccessfully() {
        String expectedMessage2 = "Apparel";
        String actualMessage2 = new TopMenuPage().verifyApparelPages();
        Assert.assertEquals(actualMessage2, expectedMessage2);
    }

    @When("^I click on DigitalDownloads link$")
    public void iClickOnDigitalDownloadsLink() throws InterruptedException {
        new TopMenuPage().selectMenu("Digital downloads");
    }

    @Then("^I navigate digitaldownloads page successfully$")
    public void iNavigateDigitaldownloadsPageSuccessfully() {
        String expectedMessage3 = "Digital downloads";
        String actualMessage3 = new TopMenuPage().verifyDigitalDownload();
        Assert.assertEquals(actualMessage3, expectedMessage3);
    }

    @When("^I click on Books link$")
    public void iClickOnBooksLink() throws InterruptedException {
        new TopMenuPage().selectMenu("Books");
    }

    @Then("^I navigate books page successfully$")
    public void iNavigateBooksPageSuccessfully() {
        String expectedMessage4 = "Books";
        String actualMessage4 = new TopMenuPage().verifyBooksPages();
        Assert.assertEquals(actualMessage4, expectedMessage4);
    }


    @When("^I click on Jewelry link$")
    public void iClickOnJewelryLink() throws InterruptedException {
        new TopMenuPage().selectMenu("Jewelry");
    }

    @Then("^I navigate to Jewelry page successfully$")
    public void iNavigateToJewelryPageSuccessfully() {
        String expectedMessage5 = "Jewelry";
        String actualMessage5 = new TopMenuPage().verifyJewelryPages();
        Assert.assertEquals(actualMessage5, expectedMessage5);
    }

    @When("^I click on GiftCards link$")
    public void iClickOnGiftCardsLink() throws InterruptedException {
        new TopMenuPage().selectMenu("GiftCards");
    }

    @Then("^I navigae to GiftCards page successfully$")
    public void iNavigaeToGiftCardsPageSuccessfully() {
        String expectedMessage6 = "Gift Cards";
        String actualMessage6 = new TopMenuPage().verifyGiftCardsPages();
        Assert.assertEquals(actualMessage6, expectedMessage6);

    }
}
