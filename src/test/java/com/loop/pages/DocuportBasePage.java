package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DocuportBasePage {

    public DocuportBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@ class=\"app-layout--logo pa-4\"]")
    public WebElement docuportLogo;
    @FindBy(xpath = "//span[contains(text(),'Upload')]/../..")
    public WebElement uploadButton;
    @FindBy(xpath = "//div[@role='listbox']/a")
    List<WebElement> navigationBar;

    @FindBy(xpath = "//span[contains(text(),'BG')]/../../../..")
    public WebElement bgDropdownButton;
    @FindBy(xpath = "//div[@class='col col-4']/button")
    public WebElement burgerButton;


    public void clickNavigationBar(String option){
        Driver.getDriver().findElement(By.xpath("//a[@href='/"+option+"']")).click();
    }

    public String getNavigationBarOpts(String option){
        BrowserUtils.waitForClickable(docuportLogo,5);
        String actualOption = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'"+option+"')]")).getText();

        return actualOption;
    }

}
