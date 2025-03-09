package PageObjects;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class Open_Page_Runs {
    static WebDriver driver;
    static Scanner input;

    public Open_Page_Runs(WebDriver driver, Scanner input) {
        this.driver = driver;
        this.input = input;

    }

    public static void TimeOut(WebDriver driver, int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public static String Enter_Mail() {

        System.out.println("Enter youre mail\n Notice!!! mail address in English, with @ only one time and valid domain");
        String str = input.nextLine();
        return str;
    }

    public static String Enter_Password() {

        System.out.println("Enter youre password \n Notice!!! password only in English, with minimum of 1 capital letter and between 8 to 10 notes");
        String str = input.nextLine();
        return str;
    }

    public static String Enter_Name() {

        System.out.println("Enter youre Name \n Notice!!! name only in English, with no numbers or spacial char,name have to be two letters or longer");
        String str = input.nextLine();
        return str;
    }


    public static void LoginTests(Email mail, Password password, LoginPage logpage, LogInCliksTests logtests, Constants constant) {
//		String strMail= Enter_Mail();
        String strMail = constant.getMail();
        TimeOut(driver, 2);
        mail.MailTests(logpage, strMail);
        TimeOut(driver, 2);
//		String strPass= Enter_Password();
        String strPass = constant.getPassword();
        TimeOut(driver, 2);
        password.PasswordTests(logpage, strPass);
        TimeOut(driver, 2);
        logtests.ClickRemember_me_btn(logpage);
        TimeOut(driver, 2);
        logtests.ClickLogInBnt(logpage);
    }

    public static void Forgot_Password_Tests(Email mail, LoginPage logpage, LogInCliksTests logtests, Forgot_Password_Page fpp) {
        String strMail = Enter_Mail();
        TimeOut(driver, 2);
        TimeOut(driver, 25);
        logtests.ClickForgot_password(logpage);
        TimeOut(driver, 5);
        mail.MailTests(fpp, strMail);
//		fpp.getBackToLogin_btn().click();
        fpp.getReset_btn().click();
    }


    public static void SignUp_Tests(Email mail, Password password, LoginPage logpage, LogInCliksTests logtests, SignUpPage signpage, Name name) {

        TimeOut(driver, 25);
        logtests.ClickSignUp_btn(logpage);
        TimeOut(driver, 25);
        String strName = Enter_Name();
        TimeOut(driver, 2);
        name.FirstNameTests(signpage, strName);
        strName = Enter_Name();
        TimeOut(driver, 2);
        name.LastNameTests(signpage, strName);
        TimeOut(driver, 25);

        String strMail = Enter_Mail();
        mail.MailTests(signpage, strMail);
        String strPass = Enter_Password();
        TimeOut(driver, 2);
        password.PasswordTests(logpage, strPass);
        strPass = Enter_Password();
        password.RetypePassword(signpage, strPass);

        TimeOut(driver, 25);
        signpage.getSignIn_btn().click();
//		signpage.getLogIn_btn().click();
    }


}
