package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    private static final Logger log = Logger.getLogger(ComputerPage.class);

    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerText;



    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement desktopTab;

    public String getComputerMessageRequired() {
        //Reporter.log("get " + computerText.toString());
        log.info("click in computer tab" + computerText.toString());
        return getTextFromElement(computerText);
    }

    public void mouseHoverToElement() {
        clickOnElement(desktopTab);

    }
}
