package testcases;

import Base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;




public class LoginPageTest extends TestBase   {
    LoginPage loginPage;
    HomePage homePage;

    AccountPage accountPage;

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();

    }

    @Test(priority = 1)
    public void confirmTitleTest() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "Free CRM software for any business with sales, support and customer relationship management");

    }


    @Test(priority = 2)
    public void TestLogin() {
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }


}
