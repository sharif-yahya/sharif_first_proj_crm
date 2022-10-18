package pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {


@FindBy(xpath = "//b[contains(text(),'ey')]")
    WebElement eylogo;

@FindBy(xpath = "//a[contains(text(),'ali m yahya')]")
    WebElement aliPage;

@FindBy(xpath = "//a[contains(text(),'Text Messages')]")
WebElement textMessage;

public HomePage(){
    PageFactory.initElements(driver,this);
}



public HomePage setAliPage(){
    eylogo.isDisplayed();
    aliPage.click();
    textMessage.click();

    return new HomePage();
}







}
