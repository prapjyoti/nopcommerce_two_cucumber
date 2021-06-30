package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TopMenuPage extends Utility {

    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());


    HomePage homePage = new HomePage();


    @FindBy(partialLinkText = "Compute")
    WebElement verifyComputer;

    @FindBy(partialLinkText = "Electroni")
    WebElement verifyElectronics;

    @FindBy(partialLinkText = "Appar")
    WebElement verifyApparel;

    @FindBy(partialLinkText = "Digital downloa")
    WebElement verifyDigitalDownLoads;

    @FindBy(partialLinkText = "Books")
    WebElement verifyBooks;

    @FindBy(partialLinkText = "Jewel")
    WebElement verifyJewelry;

    @FindBy(partialLinkText = "Gift Car")
    WebElement verifyGiftCard;


    public void selectMenu(String menu) throws InterruptedException {
        Thread.sleep(1000);
        if (menu == "Computers") {
            homePage.clickOnComputerLink();

        } else if (menu == "Electronics") {
            homePage.clickOnElectronicsLink();

        } else if (menu == "Apparel") {

            homePage.clickOnApparelLink();
        } else if (menu == "Digital downloads") {

            homePage.clickOnDigitalDownloadLink();
        } else if (menu == "Books") {

            homePage.clickOnBooksLink();

        } else if (menu == "Jewelry") {

            //homePage.clickOnJewlryLink();
        } else if (menu == "Gift Cards") {
            homePage.clickOnGiftCards();
        }

    }

    public String verifyComputerPages() {

        log.info("verify Computer page : " + verifyComputer.toString());
        return getTextFromElement(verifyComputer);
    }

    public String verifyElectronicsPages() {

        log.info("Navigate electronics : " + verifyElectronics.toString());
        return getTextFromElement(verifyElectronics);
    }

    public String verifyApparelPages() {

        log.info("Navigate apparel : " + verifyApparel.toString());
        return getTextFromElement(verifyApparel);
    }

    public String verifyDigitalDownload() {

        log.info("Navigate digital downloads: " + verifyDigitalDownLoads.toString());
        return getTextFromElement(verifyDigitalDownLoads);
    }

    public String verifyBooksPages() {

        log.info("Navigate Books  : " + verifyBooks.toString());
        return getTextFromElement(verifyBooks);
    }

    public String verifyJewelryPages() {

        log.info("Navigate jewelry : " + verifyJewelry.toString());
        return getTextFromElement(verifyJewelry);
    }

    public String verifyGiftCardsPages() {

        log.info("Navigate electronics : " + verifyGiftCard.toString());
        return getTextFromElement(verifyGiftCard);
    }
}
