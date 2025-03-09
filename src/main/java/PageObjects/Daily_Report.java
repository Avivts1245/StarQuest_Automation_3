package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Daily_Report extends Reports {

    public Daily_Report(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    By Fill_New_Report = By.cssSelector("[class='MuiBox-root css-1et8q24'] [tabindex]");
    By Filling_btn_1 = By.cssSelector(".MuiBox-root.css-1xpddxp > input:nth-of-type(1)");
    By Filling_btn_2 = By.cssSelector(".MuiBox-root.css-1xpddxp > input:nth-of-type(2)");
    By Filling_btn_3 = By.cssSelector(".MuiBox-root.css-1xpddxp > input:nth-of-type(3)");
    By Filling_btn_4 = By.cssSelector(".MuiBox-root.css-1xpddxp > input:nth-of-type(4)");
    By Filling_btn_5 = By.cssSelector(".MuiBox-root.css-1xpddxp > input:nth-of-type(5)");

    By wakeup_time = By.cssSelector("input[name='wakeupTime']");
    By wakeup_bar = By.cssSelector(
            ".MuiInputBase-colorPrimary.MuiInputBase-formControl.MuiInputBase-root.MuiOutlinedInput-root.css-1vpu30r > div[role='combobox']");
    By AM = By.cssSelector("ul#\\:r2q\\: > li:nth-of-type(1)");
    By PM = By.cssSelector("ul#\\:r2q\\: > li:nth-of-type(2)");

    By MorningRoutine = By.cssSelector("input#\\:r2r\\:");

    By DailyGoal1 = By.cssSelector("input#\\:r2s\\:");
    By DailyGoal2 = By.cssSelector("input#\\:r2t\\:");
    By DailyGoal3 = By.cssSelector("input#\\:r2u\\:");
    By plusbtn = By.cssSelector("[class='MuiButton-icon MuiButton-startIcon MuiButton-iconSizeMedium css-6xugel']");
    By DailyGoal4 = By.cssSelector("input#\\:r3g\\:");

    By DailyGoal5 = By.cssSelector("input#\\:r3h\\:");


    By RemoveGoal4 = By.cssSelector("[class] [class='MuiBox-root css-8d5fn0']:nth-of-type(4) [focusable]");
    By RemoveGoal5 = By.cssSelector("[class] [class='MuiBox-root css-8d5fn0']:nth-of-type(5) [focusable]");
    By WhatsappCheckbox = By.cssSelector(".PrivateSwitchBase-input.css-1m9pwf3");


    By Learning_bar = By.cssSelector("div#\\:r2v\\:");
    By Better_me = By.cssSelector(".MuiBox-root.css-2nl3ru div[role='combobox']");
    By Project = By.cssSelector(".MuiBox-root.css-1t3ybnd div[role='combobox']");
    By Product_Refinement = By.cssSelector(".MuiBox-root.css-ms6l7m div[role='combobox']");
    By Technical_sessions = By.cssSelector(".MuiBox-root.css-1t5gx88 div[role='combobox']");
    By Networking = By.cssSelector(".MuiBox-root.css-m91h7y div[role='combobox']");

    By Daily_Progress_freetext = By.cssSelector("input#\\:r3b\\:");
    By Submit_btn = By.cssSelector("[action] > [tabindex]");

    public WebElement getLearning_bar() {
        return driver.findElement(Learning_bar);
    }

    public WebElement getBetter_me() {
        return driver.findElement(Better_me);
    }

    public WebElement getProject() {
        return driver.findElement(Project);
    }

    public WebElement getProduct_Refinement() {
        return driver.findElement(Product_Refinement);
    }

    public WebElement getTechnical_sessions() {
        return driver.findElement(Technical_sessions);
    }

    public WebElement getNetworking() {
        return driver.findElement(Networking);
    }

    public WebElement getDaily_Progress_freetext() {
        return driver.findElement(Daily_Progress_freetext);
    }

    public WebElement getSubmit_btn() {
        return driver.findElement(Submit_btn);
    }


    public WebElement getFilling_btn_1() {
        return driver.findElement(Filling_btn_1);
    }

    public WebElement getFilling_btn_2() {
        return driver.findElement(Filling_btn_2);
    }

    public WebElement getFilling_btn_3() {
        return driver.findElement(Filling_btn_3);
    }

    public WebElement getFilling_btn_4() {
        return driver.findElement(Filling_btn_4);
    }

    public WebElement getFilling_btn_5() {
        return driver.findElement(Filling_btn_5);
    }

    public WebElement getWakeup_time() {
        return driver.findElement(wakeup_time);
    }

    public WebElement getWakeup_bar() {
        return driver.findElement(wakeup_bar);
    }

    public WebElement getAM() {
        return driver.findElement(AM);
    }

    public WebElement getPM() {
        return driver.findElement(PM);
    }

    public WebElement getMorningRoutine() {
        return driver.findElement(MorningRoutine);
    }

    public WebElement getDailyGoal1() {
        return driver.findElement(DailyGoal1);
    }

    public WebElement getDailyGoal2() {
        return driver.findElement(DailyGoal2);
    }

    public WebElement getDailyGoal3() {
        return driver.findElement(DailyGoal3);
    }

    public WebElement getPlusbtn() {
        return driver.findElement(plusbtn);
    }

    public WebElement getDailyGoal4() {
        return driver.findElement(DailyGoal4);
    }

    public WebElement getRemoveGoal4() {
        return driver.findElement(RemoveGoal4);
    }

    public WebElement getDailyGoal5() {
        return driver.findElement(DailyGoal5);
    }

    public WebElement getRemoveGoal5() {
        return driver.findElement(RemoveGoal5);
    }

    public WebElement getFill_New_Report() {
        return driver.findElement(Fill_New_Report);
    }

    public WebElement getWhatsappCheckbox() {
        return driver.findElement(WhatsappCheckbox);
    }

}
