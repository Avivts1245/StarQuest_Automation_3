package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Fill_Report {
    WebDriver driver;
    Actions actions;
    Reports reports = new Reports(driver);
    Report_Test Rtest = new Report_Test(driver, reports, actions);

    public Fill_Report(WebDriver driver, Reports reports, Report_Test Rtest, Actions actions) {
        this.driver = driver;
        this.Rtest = Rtest;
        this.reports = reports;
        this.actions = actions;

    }


    public static void TimeOut(WebDriver driver, int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    Boolean dailyFlag = true;
    Boolean weeklyFlag = false;
    Boolean endFlag = false;

    public void Daily_Validation() {
        if (!dailyFlag) {
            this.reports.getDaily().click();
            this.dailyFlag = true;
            this.weeklyFlag = false;
            this.endFlag = false;
            TimeOut(this.driver, 4);
        }
    }

    public void Weekly_Validation() {
        if (!weeklyFlag) {
            this.reports.getWeekly().click();
            this.dailyFlag = false;
            this.weeklyFlag = true;
            this.endFlag = false;
            TimeOut(this.driver, 4);
        }
    }

    public void END_Validation() {
        if (!endFlag) {
            this.reports.getEnd().click();
            this.dailyFlag = false;
            this.weeklyFlag = false;
            this.endFlag = true;
            TimeOut(this.driver, 4);
        }
    }


    public void Fill_Daily() {
        Daily_Validation();
        this.Rtest.Fill_New_Report();

        TimeOut(driver, 2);
        this.Rtest.WakeUP_Time();
        this.Rtest.Morningroutine();
        this.Rtest.Goal1();
        this.Rtest.Goal2();
        this.Rtest.Goal3();
        this.Rtest.AddGoal();
        this.Rtest.AddGoal();
        TimeOut(driver, 2);
        this.Rtest.Goal4();
        this.Rtest.Goal5();
        TimeOut(driver, 2);
        TimeOut(driver, 2);
        this.Rtest.remove_Goal(2);
        this.Rtest.remove_Goal(1);

        this.Rtest.Whatsapp();
        TimeOut(driver, 2);
        this.Rtest.whatsapp_PopUp();
        this.Rtest.DragElement(reports.getMeizamGoal(), reports.getDragBox());
        this.Rtest.DragElement(reports.getMeizamGoal(), reports.getDragBox());
        this.Rtest.DragElement(reports.getFreeFlowGoal(), reports.getDragBox());

        this.Rtest.DragElement(reports.getLinkedIn_session(), reports.getDragBox());

        this.Rtest.Fill_Progress();
        this.Rtest.Submit();
    }

    public void Fill_Weekly() {
        Weekly_Validation();
        this.Rtest.weeklyGoalsFill();
        this.reports.getWeekly_goal_yes().click();
        this.reports.getWeekly_goal_other().click();
        this.reports.getWeekly_goal_other_fill().sendKeys("aaggeexx");
        this.reports.getthings_To_Share().sendKeys("njhbgfsjrgwj");
        this.reports.getWeekly_wisdom1().sendKeys("yyyy");
        this.reports.getWeekly_wisdom2().sendKeys("rrrr");
        this.reports.getWeekly_wisdom3().sendKeys("kuiiii");
        this.reports.getWeekly_Challenges1().sendKeys("qqqqq");
        this.reports.getWeekly_Challenges2().sendKeys("pppp");
        this.reports.getWeekly_Challenges3().sendKeys("zzzz");
        this.reports.getWeekly_submitBTN().click();
    }

    public void Fill_End() {
        END_Validation();
        this.reports.getOverview_no().click();
        this.reports.getOverview_Goal_achieved().sendKeys("5555");

//		this.reports.getOverview_Specify_completion_time().sendKeys("10");
//		this.reports.getActivitie1().sendKeys("ttt");
//		this.reports.getActivitie2().sendKeys("www");
//		this.reports.getSelf_Reflection1().sendKeys("446458");
//		this.reports.getSelf_Reflection2().sendKeys("jtk");
//		this.reports.getSelf_Reflection3().sendKeys("qgew");
//		this.reports.getbetter_tomorrow1().sendKeys("safghry");
//		this.reports.getbetter_tomorrow2().sendKeys("fsh");
//		this.reports.getbetter_tomorrow3().sendKeys("hgk");
//		this.reports.getfeelRate1().click();
//		this.reports.getCourse_progress().sendKeys("152");
//		this.reports.getFreeFlow().sendKeys("aaakkksofjgjgjgkgfkdkldkfjhkjgkgolifdghdfjrgosdgnegohwsrhorsigjhroisjghoerhojwrehj");
//		this.reports.getSubmitENDBTN().click();
    }


}
