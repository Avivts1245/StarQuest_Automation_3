package PageObjects;

import org.openqa.selenium.WebDriver;

public class LogInCliksTests {
    WebDriver driver;

    public LogInCliksTests(WebDriver driver) {
        this.driver = driver;

    }

    public static void kkk(LoginPage logpage) {
        logpage.click(logpage.getLogIn_btn());
    }

    public static void RevelPassword(LoginPage logpage) {
        logpage.getSeePassword().click();//see password

    }

    public static void ClickLogInBnt(LoginPage logpage) {
        logpage.getLogIn_btn().click();//click on login button
    }

    public static void ClickRemember_me_btn(LoginPage logpage) {
        logpage.getRemember_me_btn().click();// click on remember me

    }

    public static void ClickForgot_password(LoginPage logpage) {
        logpage.getForgot_password().click();// click on Forgot password

    }

    public static void ClickVerification(LoginPage logpage) {
        logpage.getVerification().click();// click on Verification

    }

    public static void ClickSignUp_btn(LoginPage logpage) {
        logpage.getSignUp_btn().click();// click on sign up

    }


}
