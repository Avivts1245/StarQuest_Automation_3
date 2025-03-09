package app.netlify.star_quest.StarQuestAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PageObjects.Constants;
import PageObjects.Dashboard;
import PageObjects.Dashboard_Tests;
import PageObjects.Email;
import PageObjects.Fill_Report;
import PageObjects.Name;
import PageObjects.Navigation;
import PageObjects.Open_Page_Runs;
import PageObjects.Password;
import PageObjects.Report_Test;
import PageObjects.Reports;

import java.util.*;

public class Main {

    public static void OpenSystem(WebDriver driver, String Url) {
        driver.manage().window().maximize();
        driver.get(Url);

    }

    public static void TimeOut(WebDriver driver, int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Email mail = new Email(driver);
        Password password = new Password(driver);
        Name name = new Name(driver);
        Constants constant = new Constants();

        Scanner input = new Scanner(System.in);

        Open_Page_Runs runs = new Open_Page_Runs(driver, input);

        Actions actions = new Actions(driver);


        //		tests for LoginPage
        OpenSystem(driver, constant.getURL());

//		LoginPage logpage = new LoginPage(driver); השהייה זמנית עד לתיקון מסך הLOGIN 
//		LogInCliksTests logtests = new LogInCliksTests(driver);
//	
//		runs.LoginTests(mail, password, logpage, logtests,constant);
//																// Log in to system
//
//		
//		Forgot_Password_Page fpp= new Forgot_Password_Page(driver);
////		runs.Forgot_Password_Tests(mail, logpage, logtests, fpp);
//															// reset password tests
//
//		
//		TimeOut(driver, 2);
////		tests.ClickVerification(logpage);
////		TimeOut(driver, 2);
////		tests.ClickSignUp_btn(logpage);
////		TimeOut(driver, 2);
//
//		
//		
//		
//												
//		SignUpPage signpage = new SignUpPage(driver);
//		runs.SignUp_Tests(mail, password, logpage, logtests, signpage, name);
        //		tests for SignupPage
        TimeOut(driver, 2);
        TimeOut(driver, 2);
        TimeOut(driver, 2);

        TimeOut(driver, 2);
        Dashboard dashboard = new Dashboard(driver);
        boolean flag = false;
        Dashboard_Tests dashtests = new Dashboard_Tests(flag, driver);
        Navigation navigation = new Navigation(driver, dashboard, dashtests, constant);
        navigation.navigate_In_ToolBar();

        TimeOut(driver, 2);
        TimeOut(driver, 2);
        TimeOut(driver, 2);


//
        Reports reports = new Reports(driver);
        Report_Test Rtest = new Report_Test(driver, reports, actions);
        Fill_Report Freport = new Fill_Report(driver, reports, Rtest, actions);
        Freport.Fill_Daily();
        Freport.Fill_Weekly();
        Freport.Fill_End();


        12313


    }

}
