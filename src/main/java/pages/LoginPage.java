package pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends TestBase {





    @FindBy(xpath = "//input[@name='email']")
    WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordKey;

    @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
    WebElement LoginBtn;

    @FindBy(xpath = "//*[contains(text(),'Login')]")
    WebElement setLoginBtn;


  public LoginPage(){

      PageFactory.initElements(driver, this);

  }
  public String confirmTitle(){
   return driver.getTitle();
  }





    public HomePage login(String username, String password){

      setLoginBtn.click();
     email.sendKeys(username);
     passwordKey.sendKeys(password);
     LoginBtn.click();

     return new HomePage();


    }


}