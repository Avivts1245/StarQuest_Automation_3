package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
    WebDriver driver;

    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    By Toolbar = By.cssSelector(
            ".MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeMedium.css-dics6c");
    By DashboardPage = By.cssSelector("[href='\\/']");
    //	By Reports = By.cssSelector("ul:nth-of-type(1) > li:nth-of-type(2)");
    By Reports = By.linkText("Reports");
    By Quest = By.cssSelector("[href='\\/user-quest']");
    By Roadmap = By.cssSelector(
            "[href='\\/user-quest']");
    By LeaderBoard = By.cssSelector(
            "[href='\\/leaderboard']");

    By AdminInvite = By.cssSelector("[href='\\/admin-invite']");
    By Backlog = By.cssSelector("[href='\\/Admin-backlog'] .MuiListItemText-primary");
    By MenteesOverview = By.cssSelector("[href='\\/MenteesOverview'] .MuiListItemText-primary");
    By AdminPosition = By.cssSelector("[href='\\/admin-position'] .MuiListItemText-primary");

    By Settings = By.cssSelector(
            "[href='\\/user-profile']");
    By Logout = By.cssSelector(
            "ul:nth-of-type(2) > li:nth-of-type(2)");


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
