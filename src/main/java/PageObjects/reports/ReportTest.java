package PageObjects.reports;

import PageObjects.generalAndNavigation.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ReportTest {
   private final WebDriver driver;
    private Actions actions;
    private int addGoalsCnt = 0;
    private Boolean whatsappFlag = false;
    private Reports reports;
    private boolean AMPMflag = false;
    private boolean NewReportflag = false;
    private  Constants constant;
    public ReportTest(WebDriver driver, Reports reports, Actions actions, Constants constant) {
        this.driver = driver;
        this.reports = reports;
        this.actions = actions;
        this.constant=constant;
    }

    public void fillNewReport() {
        if (!NewReportflag) {
            reports.getFillNewReport().click();
            this.NewReportflag = true;
        }
    }

    public void rateYourDay() {
        this.reports.getRate().click();
    }

    public void wakeUPTime() {
        reports.getWakeUp_Time().sendKeys("10:30");
        if (AMPMflag)
            return;
        reports.getAMPM().click();
        this.AMPMflag = true;
        reports.getAM().click();
    }

    public void morningRoutine() {
        reports.getMorning_routine().sendKeys("kuku muku");
    }

    public void goal1() {
        reports.getDailyGoal1().sendKeys("wake up");
    }

    public void goal2() {
        reports.getDailyGoal2().sendKeys("eat");
    }

    public void Goal3() {
        reports.getDailyGoal3().sendKeys("sleep");
    }

    public void addGoal() {
        if (addGoalsCnt < 2) {
            reports.getAddGoalBTN().click();
            this.addGoalsCnt++;
        } else
            System.out.println("you can't add more goals today");
    }

    public void goal4() {
        if (this.addGoalsCnt == 1)
            reports.getDailyGoal4().sendKeys("AAA");
    }

    public void Goal5() {
        if (this.addGoalsCnt == 2)
            reports.getDailyGoal5().sendKeys("BBB");
    }

    public void removeGoal2() {
        reports.getRemoveGoalBTN2().click();
    }

    public void removeGoalClick(int num) {
        removeGoal(num).click();
    }

    public WebElement removeGoal(int goal) {
        if (this.addGoalsCnt == 0) {
            System.out.println("there is no goal to remove");
            return reports.getDailyGoal1();
        }
        if (this.addGoalsCnt == 1)
            return reports.getRemoveGoalBTN1();
        if (this.addGoalsCnt == 2 && goal == 1) {
            this.addGoalsCnt--;
            return reports.getRemoveGoalBTN1();
        }
        return reports.getRemoveGoalBTN2();
    }

    public void whatsapp() {
        reports.getWhatsappCheckBox().click();
        this.whatsappFlag = true;
    }

    public void whatsappPopUp() {
        reports.getClosePopUp().click();
        this.whatsappFlag = false;
    }

    public void fillProgress() {
        reports.getShare_Progress().sendKeys("tttttttt");
    }

    public void submit() {
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

    public void dragElement(WebElement sourceElement, WebElement targetElement) {
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
    }
}
