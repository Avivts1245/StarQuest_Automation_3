package PageObjects.generalAndNavigation;

import org.openqa.selenium.WebDriver;

public class Navigation {
   private final WebDriver driver;
   private final Dashboard dashboard;
   private final DashboardTests dashboardTests;
   private final Constants constant;

    public Navigation(WebDriver driver, Dashboard dashboard, DashboardTests dashboardTests, Constants constant) {
        this.dashboard = dashboard;
        this.driver = driver;
        this.dashboardTests = dashboardTests;
        this.constant = constant;
    }

    public void navigateInToolBar() {
        this.constant.timeOut(driver, 2);
        this.dashboardTests.openCloseToolbar(dashboard);
        this.constant.timeOut(driver, 8);
        enterReports();
        this.constant.timeOut(driver, 4);
    }

    private void enterReports() {
        this.dashboardTests.goToReports(dashboard);
        this.dashboardTests.openCloseToolbar(dashboard);
    }

    public void enterLeaderBoard() {
        this.dashboardTests.goToLeaderBoard(dashboard);
    }
    public void enterQuest() {
        this.dashboardTests.goToQuest(dashboard);
    }
    public void enterRoadmap() {
        this.dashboardTests.goToRoadmap(dashboard);
    }
    public void enterSettings() {
        this.dashboardTests.goToSettings(dashboard);
    }
    public void enterLoagout() {
        this.dashboardTests.logout(dashboard);
    }
    public void enterAdminInvite() {
        this.dashboardTests.goToAdminInvite(dashboard);
    }
    public void enterAdminPosition() {
        this.dashboardTests.goToAdminPosition(dashboard);
    }
    public void enterMenteesOverview() {
        this.dashboardTests.goToMenteesOverview(dashboard);
    }
    public void enterBacklog() {
        this.dashboardTests.goToBacklog(dashboard);
    }
}
