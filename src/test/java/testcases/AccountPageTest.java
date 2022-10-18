package testcases;

import Base.TestBase;

import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class AccountPageTest extends TestBase {
    AccountPage accountPage;
    HomePage homePage;
    LoginPage loginPage;

    public AccountPageTest() {
        super();

    }

    @BeforeMethod
    public void setUp2() {
        initialization();
        loginPage = new LoginPage();
        accountPage = new AccountPage();
    }


    @Test(priority = 2)
    public void freeAccountTest() {
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        homePage = accountPage.setAccount(prop.getProperty("address1"), "city1");


    }

    @AfterMethod
    public void tearDown() {

        driver.quit();

    }


}
