package testcases;

import Base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp3() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void homePageTest() {
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
       homePage = homePage.setAliPage();



    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
        }


}
