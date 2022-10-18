package pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends TestBase {



    @FindBy(xpath = "//*[contains(text(),'Free account')]")
    WebElement freeAccount;

    @FindBy(xpath = "//*[contains(text(),'Accounts')]")
    WebElement account;

    @FindBy(xpath = "//input[@name='address']")
    WebElement address;

    @FindBy(xpath = "//input[@name='city']")
    WebElement city;

    public AccountPage(){
        PageFactory.initElements(driver,this);
    }
    public HomePage setAccount(String address1 , String city1){

        freeAccount.click();
        account.click();
        address.sendKeys(address1);
        city.sendKeys(city1);

        return new HomePage();

    }




}
