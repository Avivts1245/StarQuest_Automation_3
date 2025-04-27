package PageObjects.generalAndNavigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
    WebDriver driver;

   private final By Toolbar = By.cssSelector(".MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeMedium.css-dics6c");
   private final By DashboardPage = By.cssSelector("[href='\\/']");
   private final By Reports = By.linkText("Reports");
   private final By Quest = By.cssSelector("[href='\\/user-quest']");
   private final By Roadmap = By.cssSelector("[href='\\/user-quest']");
   private final By LeaderBoard = By.cssSelector("[href='\\/leaderboard']");
   private final By AdminInvite = By.cssSelector("[href='\\/admin-invite']");
   private final By Backlog = By.cssSelector("[href='\\/Admin-backlog'] .MuiListItemText-primary");
   private final By MenteesOverview = By.cssSelector("[href='\\/MenteesOverview'] .MuiListItemText-primary");
   private final By AdminPosition = By.cssSelector("[href='\\/admin-position'] .MuiListItemText-primary");
   private final By Settings = By.cssSelector("[href='\\/user-profile']");
   private final By Logout = By.cssSelector("ul:nth-of-type(2) > li:nth-of-type(2)");
    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getToolbar() {
        return driver.findElement(Toolbar);
    }

    public WebElement getDashboardPage() {
        return driver.findElement(DashboardPage);
    }

    public WebElement getReports() {
        return driver.findElement(Reports);
    }

    public WebElement getQuest() {
        return driver.findElement(Quest);
    }

    public WebElement getRoadmap() {
        return driver.findElement(Roadmap);
    }

    public WebElement getLeaderBoard() {
        return driver.findElement(LeaderBoard);
    }

    public WebElement getSettings() {
        return driver.findElement(Settings);
    }

    public WebElement getLogout() {
        return driver.findElement(Logout);
    }

    public WebElement getAdminInvite() {
        return driver.findElement(AdminInvite);
    }

    public WebElement getBacklog() {
        return driver.findElement(Backlog);
    }

    public WebElement getMenteesOverview() {
        return driver.findElement(MenteesOverview);
    }

    public WebElement getAdminPosition() {
        return driver.findElement(AdminPosition);
    }


}
