package app.netlify.star_quest.StarQuestAutomation;

import PageObjects.generalAndNavigation.*;
import PageObjects.loginPage.*;
import PageObjects.reports.FillReport;
import PageObjects.reports.ReportTest;
import PageObjects.reports.Reports;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class StarQuestTests {
    private InitialDriverSetup initialDriverSetup;

    public StarQuestTests(InitialDriverSetup initialDriverSetup) {
        this.initialDriverSetup = initialDriverSetup;
    }

    public void init() {
        StarQuestTests.testDashboard(initialDriverSetup.driver, initialDriverSetup.constant);
        StarQuestTests.testReport(initialDriverSetup.constant, initialDriverSetup.driver, initialDriverSetup.actions);
    }

    public static void testReport(Constants constant, WebDriver driver, Actions actions) {
        constant.timeOut(driver, 6);
        Reports reports = new Reports(driver);
        ReportTest reportTest = new ReportTest(driver, reports, actions, constant);
        FillReport fillReport = new FillReport(driver, reports, reportTest, actions, constant);
        fillReport.fillDaily();
        fillReport.fillWeekly();
        // End of day report is not finished therefore the comment
//        fillReport.fillEndOfDay();
    }

    public static void testDashboard(WebDriver driver, Constants constant) {
        Dashboard dashboard = new Dashboard(driver);
        DashboardTests dashboardTests = new DashboardTests(false, driver);
        Navigation navigation = new Navigation(driver, dashboard, dashboardTests, constant);
        navigation.navigateInToolBar();
    }

    public static void testsLoginPage(WebDriver driver,
                                      Constants constant,
                                      OpenPageRuns runs,
                                      logInCliksTests tests,
                                      Name name) {
        loginPage logpage = new loginPage(driver);
        logInCliksTests logtests = new logInCliksTests(driver);
        runs.loginTests(logpage, logtests, constant);
        constant.timeOut(driver, 2);
        tests.clickVerification(logpage);
        constant.timeOut(driver, 2);
        tests.clickSignUpBtn(logpage);
        constant.timeOut(driver, 2);
        testsSignInPage(driver, constant, runs, name, logpage, logtests);

    }

    public static void testsSignInPage(WebDriver driver, Constants constant, OpenPageRuns runs, Name name, loginPage logpage, logInCliksTests logtests) {
        SignUpPage signpage = new SignUpPage(driver);
        runs.signUpTests(constant, logpage, logtests, signpage, name);
    }

    public static void testsForgotPassword(WebDriver driver, Constants constant, OpenPageRuns runs, loginPage logpage, logInCliksTests logtests) {
        forgotPasswordPage forgotPasswordPage = new forgotPasswordPage(driver);
        runs.forgotPasswordTests(constant, logpage, logtests, forgotPasswordPage);
    }
}
