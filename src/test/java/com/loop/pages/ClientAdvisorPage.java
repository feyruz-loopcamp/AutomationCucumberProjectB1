package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientAdvisorPage extends DocuportBasePage {

    public ClientAdvisorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[contains(text(),'Create new client')]/../..")
    public WebElement createNewClientButton;
    @FindBy(xpath = "//span[contains(text(),'Personal')]/../../..")
    public WebElement personalOption;
    //pop-out window
    @FindBy(xpath ="//label[contains(text(),'First name')]/following-sibling::input" )
    public WebElement firstNameBox;
    @FindBy(xpath ="//label[contains(text(),'Last name')]/following-sibling::input" )
    public WebElement lastNameBox;
    @FindBy(xpath ="(//label[contains(text(),'Owner')]/following-sibling::input)[1]" )
    public WebElement ownerDropdown;
    @FindBy(xpath = "//div[@class=\"v-input--selection-controls__input\"]")
    public WebElement creatNewUserCheckbox;
    @FindBy(xpath = "//label[contains(text(),'Email')]/following-sibling::input")
    public WebElement emailBox;
    @FindBy(xpath = "//label[contains(text(),'Advisor')]/..")
    public WebElement advisorBox;
    @FindBy(xpath = "//div[contains(text(),'Group2')]")
    public WebElement batch1Group2;
   @FindBy(xpath = "//label[contains(text(),'Phone')]/following-sibling::input")
    public WebElement phoneNumberBox;
    @FindBy(xpath = "//label[contains(text(),'Password')]/following-sibling::input")
    public WebElement passwordBox;
    @FindBy(xpath = "//label[contains(text(),'Confirm password')]/following-sibling::input")
    public WebElement confirmPasswordBox;
    @FindBy(xpath = "//span[contains(text(),'Save')]/..")
    public WebElement saveButton;
    @FindBy(xpath ="//label[contains(text(),'Services')]/../div/following-sibling::div/div" )
    public WebElement servicesBox;
    @FindBy(xpath = "//div[contains(text(),'Bookkeeping')]/..")
    public WebElement bookkiping;
    @FindBy(xpath = "//div[@class='docu-notifications']")
    public WebElement successMsg;

    public  void createNewClient(String firstName, String lastName, String email,String phoneNumber){
        BrowserUtils.waitForClickable(createNewClientButton,3).click();
        personalOption.click();
        BrowserUtils.waitForVisibility(firstNameBox,3).sendKeys(firstName);
        lastNameBox.sendKeys(lastName);
        creatNewUserCheckbox.click();
        BrowserUtils.waitForVisibility(emailBox,3).sendKeys(email);
        advisorBox.click();
        batch1Group2.click();
        phoneNumberBox.sendKeys(phoneNumber);
        passwordBox.sendKeys("St123!");
        confirmPasswordBox.sendKeys("St123!");
        saveButton.click();
        System.out.println(successMsg.getText());

    }
    public  void editClient(){
        advisorBox.click();
        batch1Group2.click();
        servicesBox.click();
        bookkiping.click();
        servicesBox.click();
BrowserUtils.justWait(10);
        BrowserUtils.waitForClickable(saveButton,15).click();
        System.out.println(successMsg.getText() + " this is after clicking");

    }

}
