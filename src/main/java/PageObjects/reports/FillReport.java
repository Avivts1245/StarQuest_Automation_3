package PageObjects.reports;

import PageObjects.generalAndNavigation.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FillReport {
    private final WebDriver driver;
    private final Actions actions;
    private final Reports reports;
    private final ReportTest reportTest;
    private final Constants constant;
    private Boolean isDailyReport = true;
    private Boolean isWeeklyReport = false;
    private Boolean isEndOfDayReport = false;

    public FillReport(WebDriver driver, Reports reports, ReportTest reportTest, Actions actions, Constants constant) {
        this.driver = driver;
        this.reportTest = reportTest;
        this.reports = reports;
        this.actions = actions;
        this.constant = constant;

    }


    public void dailyValidation() {
        if (isDailyReport) return;
        this.reports.getDaily().click();
        this.isDailyReport = true;
        this.isWeeklyReport = false;
        this.isEndOfDayReport = false;
        this.constant.timeOut(this.driver, 4);
    }

    public void weeklyValidation() {
        if (isWeeklyReport) return;
        this.reports.getWeekly().click();
        this.isDailyReport = false;
        this.isWeeklyReport = true;
        this.isEndOfDayReport = false;
        this.constant.timeOut(this.driver, 4);

    }

    public void endOfDayValidation() {
        if (isEndOfDayReport) return;
        this.reports.getEnd().click();
        this.isDailyReport = false;
        this.isWeeklyReport = false;
        this.isEndOfDayReport = true;
        this.constant.timeOut(this.driver, 4);
    }

    public void fillDaily() {
        dailyValidation();
        this.reportTest.Fill_New_Report();
        this.constant.timeOut(this.driver, 4);
        this.reportTest.WakeUP_Time();
        this.reportTest.Morningroutine();
        this.reportTest.Goal1();
        this.reportTest.Goal2();
        this.reportTest.Goal3();
        this.reportTest.AddGoal();
        this.reportTest.AddGoal();
        this.constant.timeOut(this.driver, 4);
        this.reportTest.Goal4();
        this.reportTest.Goal5();
        this.constant.timeOut(this.driver, 4);
        this.reportTest.remove_Goal(2);
        this.reportTest.remove_Goal(1);
        this.reportTest.Whatsapp();
        this.constant.timeOut(this.driver, 4);
        this.reportTest.whatsapp_PopUp();
        this.reportTest.DragElement(reports.getMeizamGoal(), reports.getDragBox());
        this.reportTest.DragElement(reports.getMeizamGoal(), reports.getDragBox());
        this.reportTest.DragElement(reports.getFreeFlowGoal(), reports.getDragBox());
        this.reportTest.DragElement(reports.getLinkedIn_session(), reports.getDragBox());
        this.reportTest.Fill_Progress();
        this.reportTest.Submit();
    }

    public void fillWeekly() {
        weeklyValidation();
        this.reportTest.weeklyGoalsFill();
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

    public void fillEndOfDay() {
        endOfDayValidation();
        this.reports.getOverview_no().click();
        this.reports.getOverview_Goal_achieved().sendKeys("5555");
		this.reports.getOverview_Specify_completion_time().sendKeys("10");
		this.reports.getActivitie1().sendKeys("ttt");
		this.reports.getActivitie2().sendKeys("www");
		this.reports.getSelf_Reflection1().sendKeys("446458");
		this.reports.getSelf_Reflection2().sendKeys("jtk");
		this.reports.getSelf_Reflection3().sendKeys("qgew");
		this.reports.getbetter_tomorrow1().sendKeys("safghry");
		this.reports.getbetter_tomorrow2().sendKeys("fsh");
		this.reports.getbetter_tomorrow3().sendKeys("hgk");
		this.reports.getfeelRate1().click();
		this.reports.getCourse_progress().sendKeys("152");
		this.reports.getFreeFlow().sendKeys("aaakkksofjgjgjgkgfkdkldkfjhkjgkgolifdghdfjrgosdgnegohwsrhorsigjhroisjghoerhojwrehj");
		this.reports.getSubmitENDBTN().click();
    }


}
