package PageObjects.loginPage;

import org.openqa.selenium.WebDriver;

public class logInCliksTests {
    private final WebDriver driver;

    public logInCliksTests(WebDriver driver) {
        this.driver = driver;
    }

    public void revelPassword(loginPage loginPage) {
        loginPage.getSeePassword().click();
    }

    public void clickLogInBnt(loginPage loginPage) {
        loginPage.getLogInBtn().click();
    }

    public void clickRememberMeBtn(loginPage loginPage) {
        loginPage.getRememberMeBtn().click();
    }

    public void clickForgotPassword(loginPage loginPage) {
        loginPage.getForgot_password().click();
    }

    public void clickVerification(loginPage loginPage) {
        loginPage.getVerification().click();
    }

    public void clickSignUpBtn(loginPage loginPage) {
        loginPage.getSignUpBtn().click();
    }
}
