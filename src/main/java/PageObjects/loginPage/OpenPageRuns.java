package PageObjects.loginPage;

import java.util.Scanner;
import PageObjects.generalAndNavigation.Constants;
import org.openqa.selenium.WebDriver;

public class OpenPageRuns {
    private final WebDriver driver;
    private Scanner input;
    private final Constants constant;
    public OpenPageRuns(WebDriver driver, Scanner input, Constants constant) {
        this.driver = driver;
        this.input = input;
        this.constant=constant;
    }

    public void loginTests(loginPage loginPage, logInCliksTests logInCliksTests, Constants constant) {
        this.constant.timeOut(this.driver,4);
        logInCliksTests.clickRememberMeBtn(loginPage);
        this.constant.timeOut(this.driver,4);
        logInCliksTests.clickLogInBnt(loginPage);
    }

    public void forgotPasswordTests(Constants constant, loginPage loginPage, logInCliksTests logInCliksTests, forgotPasswordPage forgotPasswordPage) {
        this.constant.timeOut(this.driver,10);
        logInCliksTests.clickForgotPassword(loginPage);
		forgotPasswordPage.getBackToLoginBtn().click();
        forgotPasswordPage.getResetBtn().click();
    }

    public void signUpTests(Constants constant, loginPage loginPage,  logInCliksTests logInCliksTests, SignUpPage signUpPage, Name name) {
        this.constant.timeOut(this.driver,10);
        logInCliksTests.clickSignUpBtn(loginPage);
        this.constant.timeOut(this.driver,10);
        Name.firstNameTests(signUpPage, constant.getFirst_Name());
        this.constant.timeOut(this.driver,2);
        name.lastNameTests(signUpPage,constant.getLast_Name());
        this.constant.timeOut(this.driver,10);
        String strMail = constant.getMail();
        String strPass = constant.getPassword();
        this.constant.timeOut(this.driver,10);
        signUpPage.getSignInBtn().click();
    }
}
