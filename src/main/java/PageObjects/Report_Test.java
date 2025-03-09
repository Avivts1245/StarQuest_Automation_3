package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Report_Test {
    WebDriver driver;
    Actions actions;
    int Add_Goals_cnt = 0;
    Boolean WhatsappFlag = false;
    Reports reports = new Reports(driver);
    static boolean AMPMflag = false;
    static boolean NewReportflag = false;

    public Report_Test(WebDriver driver, Reports reports, Actions actions) {
        this.driver = driver;
        this.reports = reports;
        this.actions = actions;

    }

    public static void TimeOut(WebDriver driver, int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public void Fill_New_Report() {
        if (!NewReportflag) {
            reports.getFill_New_Report().click();
            this.NewReportflag = true;
        }
    }

    public void Rate_your_Day() {
        this.reports.getRate().click();
    }

    public void WakeUP_Time() {
        reports.getWakeUp_Time().sendKeys("10:30");
        if (!AMPMflag) {
            reports.getAMPM().click();
            this.AMPMflag = true;
            reports.getAM().click();
//			reports.getPM().click();
        }
    }

    public void Morningroutine() {
        reports.getMorning_routine().sendKeys("kuku muku");

    }

    public void Goal1() {
        reports.getDaily_Goal1().sendKeys("wake up");
    }

    public void Goal2() {
        reports.getDaily_Goal2().sendKeys("eat");
    }

    public void Goal3() {
        reports.getDaily_Goal3().sendKeys("sleep");
    }

    public void AddGoal() {
        if (Add_Goals_cnt < 2) {
            reports.getAddGoalBTN().click();
            this.Add_Goals_cnt++;
        } else
            System.out.println("you can't add more goals today");

    }

    public void Goal4() {
        if (this.Add_Goals_cnt == 1)
            reports.getDaily_Goal4().sendKeys("AAA");
    }

    public void Goal5() {
        if (this.Add_Goals_cnt == 2)
            reports.getDaily_Goal5().sendKeys("BBB");
    }

    public void Removegoal2() {
        reports.getRemoveGoalBTN2().click();
    }

    public void remove_Goal(int num) {
        RemoveGoal(num).click();
    }

    public WebElement RemoveGoal(int goal) {
        if (this.Add_Goals_cnt == 0) {
            System.out.println("there is no goal to remove");
            return reports.getDaily_Goal1();
        }
        if (this.Add_Goals_cnt == 1)
            return reports.getRemoveGoalBTN1();
        if (this.Add_Goals_cnt == 2 && goal == 1) {
            this.Add_Goals_cnt--;
            return reports.getRemoveGoalBTN1();

        }
        return reports.getRemoveGoalBTN2();
    }

    public void Whatsapp() {
        reports.getWhatsapp_Check_box().click();
        this.WhatsappFlag = true;
    }

    public void whatsapp_PopUp() {
        reports.getClosePopUp().click();
        this.WhatsappFlag = false;
    }

    public void Fill_Progress() {
        reports.getShare_Progress().sendKeys("tttttttt");
    }

    public void Submit() {
        reports.getSubmitBTN().click();
    }

    public void weeklyGoalsFill() {
        this.reports.getWeekly_goal1().sendKeys("fdagh");
        this.reports.getWeekly_goal2().sendKeys("dfgfh");
        this.reports.getWeekly_goal3().sendKeys("sss");
        this.reports.getWeekly_goal4().sendKeys("jjjj");
        this.reports.getWeekly_goal5().sendKeys("scvvfssfg");
        this.reports.getWeekly_goal6().sendKeys("13514");
    }


    public void DragElement(WebElement sourceElement, WebElement targetElement) {
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
//		actions.clickAndHold(sourceElement)
//	       .moveToElement(targetElement)
//	       .release()
//	       .build()
//	       .perform();
//		this.reports.getFreeFlow30MIN().click();
    }

}
