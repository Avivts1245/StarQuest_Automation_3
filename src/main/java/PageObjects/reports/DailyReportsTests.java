package PageObjects.reports;

import org.openqa.selenium.WebDriver;
public class DailyReportsTests {

    private final WebDriver driver;
    private int numberOfGoals = 3;
    private dailyReport dailyReport;
    public DailyReportsTests(WebDriver driver,dailyReport dailyReport) {
        this.driver = driver;
        this.dailyReport= dailyReport;
    }

    public void fillNewReport(dailyReport dailyReport) {
        this.dailyReport.getFillNewReport().click();
        System.out.println("aaaaaaa");

    }

    public void checkIfYouCanAccessToTestsInside(boolean inReportFlag) { //
        if (!inReportFlag)
            fillNewReport(this.dailyReport);
        else
            System.out.println("cant");
    }

    public void rateFillingCases(int num) {
        if (num == 1) {
            this.dailyReport.getFillingBtn1().click();
            return;
        }
        if (num == 2) {
            this.dailyReport.getFillingBtn2().click();
            return;
        }
        if (num == 4) {
            this.dailyReport.getFillingBtn4().click();
            return;
        }
        if (num == 5) {
            this.dailyReport.getFillingBtn5().click();
            return;
        }

        this.dailyReport.getFillingBtn3().click();
    }

    public void WakeUp(String wakeuptime, boolean morning) {
        this.dailyReport.getWakeupTime().sendKeys(wakeuptime);
        this.dailyReport.getWakeupBar().click();
        if (morning)
            this.dailyReport.getAM().click();
        else
            this.dailyReport.getPM().click();
    }

    public void Morning_rutine() {
        this.dailyReport.getMorningRoutine().sendKeys("abcdef");
    }

    public void DailyGoals() {
        this.dailyReport.getDailyGoal1().sendKeys("AAAA");
        this.dailyReport.getDailyGoal2().sendKeys("BBBB");
        this.dailyReport.getDailyGoal3().sendKeys("CCCC");
        if (numberOfGoals < 5) {
            addGoal();
            this.numberOfGoals++;
        }
    }

    public void addGoal() {
        this.dailyReport.getPlusBtn().click();
    }

    public  void removeGoal( int num) {
        if (num == 4) {
            this.dailyReport.getRemoveGoal4().click();
            return;
        }
        this.dailyReport.getRemoveGoal5().click();
    }

    public  void deletecheck(int num) {
        if (numberOfGoals > 3) {
            removeGoal(num);
            return;
        }
        System.out.println("You are requerd to have minimum of 3 goals, you cannot delete this goal");
    }

    public void clickOnWhatsapp() {
        this.dailyReport.getWhatsappCheckbox().click();
    }

    public void dailyProgress() {
        this.dailyReport.getDailyProgressFreetext().sendKeys("asdfgh");
    }

    public void submit() {
        this.dailyReport.getSubmitBtn().click();
    }
}
