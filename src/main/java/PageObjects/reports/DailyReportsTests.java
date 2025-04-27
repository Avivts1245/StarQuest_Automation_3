package PageObjects.reports;

import org.openqa.selenium.WebDriver;
public class DailyReportsTests {

  private  WebDriver driver;
    static int goalsnum = 3;

    public DailyReportsTests(WebDriver driver) {
        this.driver = driver;

    }




    public static void fillNewReport(DailyReport DReport) {


        DReport.getFill_New_Report().click();
        System.out.println("aaaaaaa");

    }

    public static void checkIfYouCanAccessToTestsInside(boolean inreportflag, DailyReport DReport) { //
        if (!inreportflag)
            fillNewReport(DReport);
        else
            System.out.println("cant");
    }

//	public static void Rate_Fillings(boolean inreportflag, Daily_Report DReport, int num) {
//		Check_if_you_can_access(inreportflag, DReport);
//		Filling_cases(DReport, num);
//
//	}

    public static void Filling_cases(DailyReport DReport, int num) { // rate cases
        if (num == 1) {
            DReport.getFilling_btn_1().click();
            return;
        }
        if (num == 2) {
            DReport.getFilling_btn_2().click();
            return;
        }
        if (num == 4) {
            DReport.getFilling_btn_4().click();
            return;
        }
        if (num == 5) {
            DReport.getFilling_btn_5().click();
            return;
        }

        DReport.getFilling_btn_3().click();
    }

    public static void WakeUp(DailyReport DReport, String wakeuptime, boolean morning) {
        DReport.getWakeup_time().sendKeys(wakeuptime);
        DReport.getWakeup_bar().click();
        if (morning)
            DReport.getAM().click();
        else
            DReport.getPM().click();
    }

    public static void Morning_rutine(DailyReport DReport) {
        DReport.getMorningRoutine().sendKeys("abcdef");
    }

    public static void DailyGoals(DailyReport DReport) {

//		boolean flag=true;
        DReport.getDailyGoal1().sendKeys("AAAA");
        DReport.getDailyGoal2().sendKeys("BBBB");
        DReport.getDailyGoal3().sendKeys("CCCC");
        if (goalsnum < 5) {
            AddGoal(DReport);
            goalsnum++;
        }

    }

    public static void AddGoal(DailyReport DReport) {
        DReport.getPlusbtn().click();
    }

    public static void RemoveGoal(DailyReport DReport, int num) {
        if (num == 4) {
            DReport.getRemoveGoal4().click();
            return;
        }
        DReport.getRemoveGoal5().click();
    }

    public static void deletecheck(DailyReport DReport, int num) {
        if (goalsnum > 3) {
            RemoveGoal(DReport, num);
            return;
        }
        System.out.println("You are requerd to have minimum of 3 goals, you cannot delete this goal");
    }

    public static void Click_on_whatsapp(DailyReport DReport) {
        DReport.getWhatsappCheckbox().click();
    }

    public static void Daily_Progress(DailyReport DReport) {
        DReport.getDaily_Progress_freetext().sendKeys("asdfgh");
    }

    public static void Submit(DailyReport DReport) {
        DReport.getSubmit_btn().click();
    }


}
