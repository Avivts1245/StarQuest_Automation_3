package PageObjects;

import org.openqa.selenium.WebDriver;

public class DaylyReportsTests {

    WebDriver driver;
    static int goalsnum = 3;

    public DaylyReportsTests(WebDriver driver) {
        this.driver = driver;

    }


    static Boolean inreportflag = false;

    public static void Fill_new_Report(Daily_Report DReport) {
//		if (inreportflag)
//			System.out.println("this Button could not be clicked right now");
//		else {

        DReport.getFill_New_Report().click();
        System.out.println("aaaaaaa");
//			inreportflag = true;
//		}
    }

    public static void Check_if_you_can_access(boolean inreportflag, Daily_Report DReport) { // check if the script can
        // reach tests insied
        // the report
        if (!inreportflag)
            Fill_new_Report(DReport);
        else
            System.out.println("cant");
    }

//	public static void Rate_Fillings(boolean inreportflag, Daily_Report DReport, int num) {
//		Check_if_you_can_access(inreportflag, DReport);
//		Filling_cases(DReport, num);
//
//	}

    public static void Filling_cases(Daily_Report DReport, int num) { // rate cases
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

    public static void WakeUp(Daily_Report DReport, String wakeuptime, boolean morning) {
        DReport.getWakeup_time().sendKeys(wakeuptime);
        DReport.getWakeup_bar().click();
        if (morning)
            DReport.getAM().click();
        else
            DReport.getPM().click();
    }

    public static void Morning_rutine(Daily_Report DReport) {
        DReport.getMorningRoutine().sendKeys("abcdef");
    }

    public static void DailyGoals(Daily_Report DReport) {

//		boolean flag=true;
        DReport.getDailyGoal1().sendKeys("AAAA");
        DReport.getDailyGoal2().sendKeys("BBBB");
        DReport.getDailyGoal3().sendKeys("CCCC");
        if (goalsnum < 5) {
            AddGoal(DReport);
            goalsnum++;
        }

    }

    public static void AddGoal(Daily_Report DReport) {
        DReport.getPlusbtn().click();
    }

    public static void RemoveGoal(Daily_Report DReport, int num) {
        if (num == 4) {
            DReport.getRemoveGoal4().click();
            return;
        }
        DReport.getRemoveGoal5().click();
    }

    public static void deletecheck(Daily_Report DReport, int num) {
        if (goalsnum > 3) {
            RemoveGoal(DReport, num);
            return;
        }
        System.out.println("You are requerd to have minimum of 3 goals, you cannot delete this goal");
    }

    public static void Click_on_whatsapp(Daily_Report DReport) {
        DReport.getWhatsappCheckbox().click();
    }

    public static void Daily_Progress(Daily_Report DReport) {
        DReport.getDaily_Progress_freetext().sendKeys("asdfgh");
    }

    public static void Submit(Daily_Report DReport) {
        DReport.getSubmit_btn().click();
    }


}
