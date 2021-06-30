package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuit {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @Given("^I am on computer page$")
    public void iAmOnComputerPage() {
        new HomePage().clickOnComputerLink();
    }

    @And("^I click on desktop link$")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktopsLink();

    }

    @And("^I sort product list as Z to A$")
    public void iSortProductListAsZToA() {
        new ComputerPage().selectPositionFromDropdown(2);
    }

    @Then("^I should sort the products in Z to A order$")
    public void iShouldSortTheProductsInZToAOrder() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> products;
        products = new ComputerPage().getProductsArrangeInOrder();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);
        Collections.sort(tempList, Collections.<String>reverseOrder());
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);


    }
}
