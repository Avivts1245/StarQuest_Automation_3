package PageObjects.reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dailyReport extends Reports {


    // Filling category
   private final By fillNewReport = By.cssSelector("[class='MuiBox-root css-1et8q24'] [tabindex]");
   private final By fillingBtn1 = By.cssSelector(".MuiBox-root.css-1xpddxp > input:nth-of-type(1)");
   private final By fillingBtn2 = By.cssSelector(".MuiBox-root.css-1xpddxp > input:nth-of-type(2)");
   private final By fillingBtn3 = By.cssSelector(".MuiBox-root.css-1xpddxp > input:nth-of-type(3)");
   private final By fillingBtn4 = By.cssSelector(".MuiBox-root.css-1xpddxp > input:nth-of-type(4)");
   private final By fillingBtn5 = By.cssSelector(".MuiBox-root.css-1xpddxp > input:nth-of-type(5)");

    //Wakup category
   private final By wakeupTime = By.cssSelector("input[name='wakeupTime']");
   private final By wakeupBar = By.cssSelector(".MuiInputBase-colorPrimary.MuiInputBase-formControl.MuiInputBase-root.MuiOutlinedInput-root.css-1vpu30r > div[role='combobox']");
   private final By AM = By.cssSelector("ul#\\:r2q\\: > li:nth-of-type(1)");
   private final By PM = By.cssSelector("ul#\\:r2q\\: > li:nth-of-type(2)");
   private final By morningRoutine = By.cssSelector("input#\\:r2r\\:");

    //Goals category
  private final By dailyGoal1 = By.cssSelector("input#\\:r2s\\:");
  private final By dailyGoal2 = By.cssSelector("input#\\:r2t\\:");
  private final By dailyGoal3 = By.cssSelector("input#\\:r2u\\:");
  private final By plusBtn = By.cssSelector("[class='MuiButton-icon MuiButton-startIcon MuiButton-iconSizeMedium css-6xugel']");
  private final By dailyGoal4 = By.cssSelector("input#\\:r3g\\:");
  private final By dailyGoal5 = By.cssSelector("input#\\:r3h\\:");
  private final By removeGoal4 = By.cssSelector("[class] [class='MuiBox-root css-8d5fn0']:nth-of-type(4) [focusable]");
  private final By removeGoal5 = By.cssSelector("[class] [class='MuiBox-root css-8d5fn0']:nth-of-type(5) [focusable]");

    // other category
   private final By whatsappCheckbox = By.cssSelector(".PrivateSwitchBase-input.css-1m9pwf3");
   private final By learningBar = By.cssSelector("div#\\:r2v\\:");
   private final By betterMe = By.cssSelector(".MuiBox-root.css-2nl3ru div[role='combobox']");
   private final By project = By.cssSelector(".MuiBox-root.css-1t3ybnd div[role='combobox']");
   private final By productRefinement = By.cssSelector(".MuiBox-root.css-ms6l7m div[role='combobox']");
   private final By technicalSessions = By.cssSelector(".MuiBox-root.css-1t5gx88 div[role='combobox']");
   private final By networking = By.cssSelector(".MuiBox-root.css-m91h7y div[role='combobox']");
   private final By dailyProgressFreetext = By.cssSelector("input#\\:r3b\\:");
   private final By submitBtn = By.cssSelector("[action] > [tabindex]");

    public dailyReport(WebDriver driver) {
        super(driver);
    }
    public WebElement getLearningBar() {
        return driver.findElement(learningBar);
    }

    public WebElement getBetterMe() {
        return driver.findElement(betterMe);
    }

    public WebElement getProject() {
        return driver.findElement(project);
    }

    public WebElement getProductRefinement() {
        return driver.findElement(productRefinement);
    }

    public WebElement getTechnicalSessions() {
        return driver.findElement(technicalSessions);
    }

    public WebElement getNetworking() {
        return driver.findElement(networking);
    }

    public WebElement getDailyProgressFreetext() {
        return driver.findElement(dailyProgressFreetext);
    }

    public WebElement getSubmitBtn() {
        return driver.findElement(submitBtn);
    }

    public WebElement getFillingBtn1() {
        return driver.findElement(fillingBtn1);
    }

    public WebElement getFillingBtn2() {
        return driver.findElement(fillingBtn2);
    }

    public WebElement getFillingBtn3() {
        return driver.findElement(fillingBtn3);
    }

    public WebElement getFillingBtn4() {
        return driver.findElement(fillingBtn4);
    }

    public WebElement getFillingBtn5() {
        return driver.findElement(fillingBtn5);
    }

    public WebElement getWakeupTime() {
        return driver.findElement(wakeupTime);
    }

    public WebElement getWakeupBar() {
        return driver.findElement(wakeupBar);
    }

    public WebElement getAM() {
        return driver.findElement(AM);
    }

    public WebElement getPM() {
        return driver.findElement(PM);
    }

    public WebElement getMorningRoutine() {
        return driver.findElement(morningRoutine);
    }

    public WebElement getDailyGoal1() {
        return driver.findElement(dailyGoal1);
    }

    public WebElement getDailyGoal2() {
        return driver.findElement(dailyGoal2);
    }

    public WebElement getDailyGoal3() {
        return driver.findElement(dailyGoal3);
    }

    public WebElement getPlusBtn() {
        return driver.findElement(plusBtn);
    }

    public WebElement getDailyGoal4() {
        return driver.findElement(dailyGoal4);
    }

    public WebElement getRemoveGoal4() {
        return driver.findElement(removeGoal4);
    }

    public WebElement getDailyGoal5() {
        return driver.findElement(dailyGoal5);
    }

    public WebElement getRemoveGoal5() {
        return driver.findElement(removeGoal5);
    }

    public WebElement getFillNewReport() {
        return driver.findElement(fillNewReport);
    }

    public WebElement getWhatsappCheckbox() {
        return driver.findElement(whatsappCheckbox);
    }
}