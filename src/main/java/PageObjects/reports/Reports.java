package PageObjects.reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reports {
   public WebDriver driver;


    // Reports Main
   private By TextBox;
   private By Button;
   private final By Daily = By.cssSelector("[href='\\/daily-reports'] [tabindex]");
   private final By Weekly = By.cssSelector("[href='\\/weekly-reports'] [tabindex]");
   private final By End = By.cssSelector("[href='\\/end-of-day-reports'] [tabindex]");
   private final By Fill_New_Report = By.cssSelector("[class='MuiBox-root css-1et8q24'] [tabindex]");
    //	Daily Report Category
   private final By Rate = By.cssSelector(".MuiBox-root.css-1xpddxp");
   private final By Morning_routine = By.cssSelector("[name='morningRoutine\\.routine']");
   private final By Daily_Goal1 = By.cssSelector("[name='dailyGoals\\.0\\.description']");
   private final By Daily_Goal2 = By.cssSelector("[name='dailyGoals\\.1\\.description']");
   private final By Daily_Goal3 = By.cssSelector("[name='dailyGoals\\.2\\.description']");
   private final By WakeUp_Time = By.cssSelector("input[name='wakeupTime']");
   private final By AMPM = By.cssSelector(".css-qiwgdb");
   private final By AM = By.cssSelector("ul[role='listbox'] > li:nth-of-type(1)");
   private final By PM = By.cssSelector("ul[role='listbox'] > li:nth-of-type(2)");
   private final By AddGoalBTN = By.cssSelector(".css-xqc20k [tabindex]");
   private final By RemoveGoalBTN1 = By.cssSelector("[class] [class='MuiBox-root css-8d5fn0']:nth-of-type(4) [tabindex]");
   private final By RemoveGoalBTN2 = By.cssSelector("[class] [class='MuiBox-root css-8d5fn0']:nth-of-type(5) [tabindex]");
   private final By Whatsapp_Check_box = By.cssSelector(".PrivateSwitchBase-input.css-1m9pwf3");
   private final By Daily_Goal4 = By.cssSelector("input[name='dailyGoals.3.description']");
   private final By Daily_Goal5 = By.cssSelector("input[name='dailyGoals.4.description']");
   private final By ClosePopUp = By.cssSelector("[class='MuiBox-root css-1nww4hi'] .MuiTypography-h5");
   private final By Share_Progress = By.cssSelector("input[name='routine']");
   private final By SubmitBTN = By.cssSelector("[action] > [tabindex]");
   private final By FreeFlowGoal = By.cssSelector("[class] [draggable='true']:nth-of-type(1) strong");
   private final By MeizamGoal = By.cssSelector(".MuiBox-root.css-2nl3ru > strong");
   private final By Product_Refinement = By.cssSelector("[class] [draggable='true']:nth-of-type(3) strong");
   private final By Workout = By.cssSelector("[class] [draggable='true']:nth-of-type(4) strong");
   private final By Free_Time = By.cssSelector(".MuiBox-root.css-1t5gx88 > strong");
   private final By learning_session = By.cssSelector(".MuiBox-root.css-m91h7y > strong");
   private final By Technical_session = By.cssSelector("[class] [draggable='true']:nth-of-type(7) strong");
   private final By LinkedIn_session = By.cssSelector("[class] [draggable='true']:nth-of-type(8) strong");
   private final By improvement_session = By.cssSelector("[class] [draggable='true']:nth-of-type(9) strong");
   private final By Filling_report = By.cssSelector("[class] [draggable='true']:nth-of-type(10) strong");
    private final By DragBox = By.cssSelector(".MuiBox-root.css-1ch9toq");
    private final By FreeFlow30MIN = By.cssSelector("li:nth-of-type(2) > .MuiTouchRipple-root.css-w0pj6f");
    //	Weekly Report Category
   private final By Weekly_goal1 = By.cssSelector("[name='moodExplanation']");
   private final By Weekly_goal2 = By.cssSelector("[name='achievedGoals\\.goals\\.0']");
   private final By Weekly_goal3 = By.cssSelector("[class='MuiFormControl-root MuiFormControl-marginNormal MuiFormControl-fullWidth MuiTextField-root css-10mjo1']:nth-child(3) [name='significantEvent']");
   private final By Weekly_goal4 = By.cssSelector("[class='MuiFormControl-root MuiFormControl-marginNormal MuiFormControl-fullWidth MuiTextField-root css-10mjo1']:nth-child(4) [name='significantEvent']");
   private final By Weekly_goal5 = By.cssSelector("[class='MuiFormControl-root MuiFormControl-marginNormal MuiFormControl-fullWidth MuiTextField-root css-10mjo1']:nth-child(4) [name='significantEvent']");
   private final By Weekly_goal6 = By.cssSelector("[class='MuiFormControl-root MuiFormControl-marginNormal MuiFormControl-fullWidth MuiTextField-root css-10mjo1']:nth-child(4) [name='newInterestingLearning']");
   private final By Weekly_routine_yes = By.cssSelector("input#maintain-yes");
   private final By Weekly_routine_no = By.cssSelector("input#maintain-no");
   private final By Weekly_routine_other = By.cssSelector("input#maintain-other");
   private final By Weekly_routine_other_fill = By.cssSelector("[class] .MuiBox-root [name='maintainWeeklyRoutine\\.details']:nth-child(3)");
   private final By Weekly_goal_yes = By.cssSelector("input#weekly-yes");
   private final By Weekly_goal_no = By.cssSelector("input#weekly-no");
   private final By Weekly_goal_other = By.cssSelector("input#weekly-other");
   private final By Weekly_goal_other_fill = By.cssSelector("input#weekly-other-text");
   private final By things_To_Share = By.cssSelector("[action] [class='MuiBox-root css-1v4hn9b']:nth-of-type(5) [name]");
   private final By Weekly_wisdom1 = By.cssSelector("[name='learningGoalAchievement\\.details']");
   private final By Weekly_wisdom2 = By.cssSelector("[name='achievedGoals']");
   private final By Weekly_wisdom3 = By.cssSelector("[action] [class='MuiBox-root css-1v4hn9b']:nth-of-type(7) [name='shareWithMentor']");
   private final By Weekly_Challenges1 = By.cssSelector("[action] [class='MuiBox-root css-1v4hn9b']:nth-of-type(8) [name='mentorInteraction\\.details']");
   private final By Weekly_Challenges2 = By.cssSelector("[name='supportInteraction\\.details']");
   private final By Weekly_Challenges3 = By.cssSelector("[action] [class='MuiBox-root css-1v4hn9b']:nth-of-type(8) [name='shareWithMentor']");
   private final By Weekly_submitBTN = By.cssSelector("[action] [class] [tabindex='0']:nth-child(9)");

    //	End Of Day Report Category
   private final By Overview_yes = By.cssSelector(".css-zcpe9j [name]");
   private final By Overview_no = By.cssSelector(".Mui-checked [name]");
   private final By Overview_Goal_achieved = By.cssSelector("[name='dailyGoals\\[0\\]\\.description']");
   private final By Overview_Specify_completion_time = By.cssSelector(".css-tle5ew");
   private final By Activitie1 = By.cssSelector("[name='actualActivity\\[0\\]\\.category']");
   private final By Activitie2 = By.cssSelector("[name='actualActivity\\[0\\]\\.duration']");
   private final By Self_Reflection1 = By.cssSelector("[name='reflection\\.secondGoodThing']");
   private final By Self_Reflection2 = By.cssSelector("[name='reflection\\.secondGoodThing']");
   private final By Self_Reflection3 = By.cssSelector("[name='reflection\\.thirdGoodThing']");
   private final By better_tomorrow1 = By.cssSelector("[name='improvement\\.firstThing']");
   private final By better_tomorrow2 = By.cssSelector("[name='improvement\\.secondThing']");
   private final By better_tomorrow3 = By.cssSelector("[name='improvement\\.thirdThing']");
   private final By feelRate1 = By.cssSelector(".MuiBox-root.css-1hzu78 > input:nth-of-type(1)");
   private final By feelRate2 = By.cssSelector(".MuiBox-root.css-1hzu78 > input:nth-of-type(2)");
   private final By feelRate3 = By.cssSelector(".MuiBox-root.css-1hzu78 > input:nth-of-type(3)");
   private final By feelRate4 = By.cssSelector(".MuiBox-root.css-1hzu78 > input:nth-of-type(4)");
   private final By feelRate5 = By.cssSelector(".MuiBox-root.css-1hzu78 > input:nth-of-type(5)");
   private final By Course_progress = By.cssSelector("input[name='wakeHour']");
   private final By FreeFlow = By.cssSelector("[name='shareWithMentor']");
   private final By SubmitENDBTN = By.cssSelector("[action] [tabindex]");

    public Reports(WebDriver driver) {
        this.driver = driver;
    }

    //	Daily Report
    public WebElement getFreeFlow30MIN() {
        return driver.findElement(FreeFlow30MIN);
    }

    public WebElement getDaily() {
        return driver.findElement(Daily);
    }

    public WebElement getWeekly() {
        return driver.findElement(Weekly);
    }

    public WebElement getEnd() {
        return driver.findElement(End);
    }

    public WebElement getFillNewReport() {
        return driver.findElement(Fill_New_Report);
    }

    public WebElement getRate() {
        return driver.findElement(Rate);
    }

    public WebElement getMorning_routine() {
        return driver.findElement(Morning_routine);
    }

    public WebElement getDailyGoal1() {
        return driver.findElement(Daily_Goal1);
    }

    public WebElement getDailyGoal2() {
        return driver.findElement(Daily_Goal2);
    }

    public WebElement getDailyGoal3() {
        return driver.findElement(Daily_Goal3);
    }

    public WebElement getWakeUp_Time() {
        return driver.findElement(WakeUp_Time);
    }

    public WebElement getAMPM() {
        return driver.findElement(AMPM);
    }

    public WebElement getAM() {
        return driver.findElement(AM);
    }

    public WebElement getPM() {
        return driver.findElement(PM);
    }

    public WebElement getTextBox(String css) {
        return driver.findElement(TextBox);
    }

    public WebElement getButton() {
        return driver.findElement(Button);
    }

    public WebElement getAddGoalBTN() {
        return driver.findElement(AddGoalBTN);
    }

    public WebElement getWhatsappCheckBox() {
        return driver.findElement(Whatsapp_Check_box);
    }

    public WebElement getRemoveGoalBTN2() {
        return driver.findElement(RemoveGoalBTN2);
    }

    public WebElement getRemoveGoalBTN1() {
        return driver.findElement(RemoveGoalBTN1);
    }

    public WebElement getDailyGoal4() {
        return driver.findElement(Daily_Goal4);
    }

    public WebElement getDailyGoal5() {
        return driver.findElement(Daily_Goal5);
    }

    public WebElement getClosePopUp() {
        return driver.findElement(ClosePopUp);
    }

    public WebElement getShare_Progress() {
        return driver.findElement(Share_Progress);
    }

    public WebElement getSubmitBTN() {
        return driver.findElement(SubmitBTN);
    }

    public WebElement getFreeFlowGoal() {
        return driver.findElement(FreeFlowGoal);
    }

    public WebElement getDragBox() {
        return driver.findElement(DragBox);

    }

    public WebElement getMeizamGoal() {
        return driver.findElement(MeizamGoal);
    }

    public WebElement getProductRefinement() {
        return driver.findElement(Product_Refinement);
    }

    public WebElement getWorkout() {
        return driver.findElement(Workout);
    }

    public WebElement getFree_Time() {
        return driver.findElement(Free_Time);
    }

    public WebElement getlearning_session() {
        return driver.findElement(learning_session);
    }

    public WebElement getTechnical_session() {
        return driver.findElement(Technical_session);
    }

    public WebElement getLinkedIn_session() {
        return driver.findElement(LinkedIn_session);
    }

    public WebElement getimprovement_session() {
        return driver.findElement(improvement_session);
    }

    public WebElement getFilling_report() {
        return driver.findElement(Filling_report);
    }


//	Weekly Report

    public WebElement getWeekly_goal1() {
        return driver.findElement(Weekly_goal1);
    }

    public WebElement getWeekly_goal2() {
        return driver.findElement(Weekly_goal2);
    }

    public WebElement getWeekly_goal3() {
        return driver.findElement(Weekly_goal3);
    }

    public WebElement getWeekly_goal4() {
        return driver.findElement(Weekly_goal4);
    }

    public WebElement getWeekly_goal5() {
        return driver.findElement(Weekly_goal5);
    }

    public WebElement getWeekly_goal6() {
        return driver.findElement(Weekly_goal6);
    }

    public WebElement getWeekly_routine_yes() {
        return driver.findElement(Weekly_routine_yes);
    }

    public WebElement getWeekly_routine_no() {
        return driver.findElement(Weekly_routine_no);
    }

    public WebElement getWeekly_routine_other() {
        return driver.findElement(Weekly_routine_other);
    }

    public WebElement getWeekly_routine_other_fill() {
        return driver.findElement(Weekly_routine_other_fill);
    }

    public WebElement getWeekly_goal_yes() {
        return driver.findElement(Weekly_goal_yes);
    }

    public WebElement getWeekly_goal_no() {
        return driver.findElement(Weekly_goal_no);
    }

    public WebElement getWeekly_goal_other() {
        return driver.findElement(Weekly_goal_other);
    }

    public WebElement getWeekly_goal_other_fill() {
        return driver.findElement(Weekly_goal_other_fill);
    }

    public WebElement getthings_To_Share() {
        return driver.findElement(things_To_Share);
    }

    public WebElement getWeekly_wisdom1() {
        return driver.findElement(Weekly_wisdom1);
    }

    public WebElement getWeekly_wisdom2() {
        return driver.findElement(Weekly_wisdom2);
    }

    public WebElement getWeekly_wisdom3() {
        return driver.findElement(Weekly_wisdom3);
    }

    public WebElement getWeekly_Challenges1() {
        return driver.findElement(Weekly_Challenges1);
    }

    public WebElement getWeekly_Challenges2() {
        return driver.findElement(Weekly_Challenges2);
    }

    public WebElement getWeekly_Challenges3() {
        return driver.findElement(Weekly_Challenges3);
    }

    public WebElement getWeekly_submitBTN() {
        return driver.findElement(Weekly_submitBTN);
    }


//	END Of Day Report

    public WebElement getOverview_yes() {
        return driver.findElement(Overview_yes);
    }

    public WebElement getOverview_no() {
        return driver.findElement(Overview_no);
    }

    public WebElement getOverview_Goal_achieved() {
        return driver.findElement(Overview_Goal_achieved);
    }

    public WebElement getOverview_Specify_completion_time() {
        return driver.findElement(Overview_Specify_completion_time);
    }

    public WebElement getActivitie1() {
        return driver.findElement(Activitie1);
    }

    public WebElement getActivitie2() {
        return driver.findElement(Activitie2);
    }

    public WebElement getSelf_Reflection1() {
        return driver.findElement(Self_Reflection1);
    }

    public WebElement getSelf_Reflection2() {
        return driver.findElement(Self_Reflection2);
    }

    public WebElement getSelf_Reflection3() {
        return driver.findElement(Self_Reflection3);
    }

    public WebElement getbetter_tomorrow1() {
        return driver.findElement(better_tomorrow1);
    }

    public WebElement getbetter_tomorrow2() {
        return driver.findElement(better_tomorrow2);
    }

    public WebElement getbetter_tomorrow3() {
        return driver.findElement(better_tomorrow3);
    }

    public WebElement getfeelRate1() {
        return driver.findElement(feelRate1);
    }

    public WebElement getfeelRate2() {
        return driver.findElement(feelRate2);
    }

    public WebElement getfeelRate3() {
        return driver.findElement(feelRate3);
    }

    public WebElement getfeelRate4() {
        return driver.findElement(feelRate4);
    }

    public WebElement getfeelRate5() {
        return driver.findElement(feelRate5);
    }

    public WebElement getCourse_progress() {
        return driver.findElement(Course_progress);
    }

    public WebElement getFreeFlow() {
        return driver.findElement(FreeFlow);
    }

    public WebElement getSubmitENDBTN() {
        return driver.findElement(SubmitENDBTN);
    }

}
