package PageObjects.generalAndNavigation;

import org.openqa.selenium.WebDriver;

public class DashboardTests {

    private final WebDriver driver;
    private boolean isToolBarOpen;

    public DashboardTests(boolean isToolBarOpen, WebDriver driver) {
        this.driver = driver;
        this.isToolBarOpen = isToolBarOpen;
    }

    public void openCloseToolbar(Dashboard dashboard) {
        dashboard.getToolbar().click();
        if (this.isToolBarOpen)
            this.isToolBarOpen = false;
        else
            this.isToolBarOpen = true;
    }

    public void goToDashboard(Dashboard dashboard) {
        dashboard.getDashboardPage().click();
    }

    public void goToReports(Dashboard dashboard) {
        dashboard.getReports().click();
    }

    public void goToQuest(Dashboard dashboard) {
        dashboard.getQuest().click();
    }

    public void goToRoadmap(Dashboard dashboard) {
        dashboard.getRoadmap().click();
    }

    public void goToAdminInvite(Dashboard dashboard) {
        dashboard.getAdminInvite().click();
    }

    public void goToBacklog(Dashboard dashboard) {
        dashboard.getBacklog().click();

    }

    public void goToMenteesOverview(Dashboard dashboard) {
        dashboard.getMenteesOverview().click();

    }

    public void goToAdminPosition(Dashboard dashboard) {
        dashboard.getAdminPosition().click();
    }

    public void goToLeaderBoard(Dashboard dashboard) {
        dashboard.getLeaderBoard().click();

    }

    public void goToSettings(Dashboard dashboard) {

        if (isToolBarOpen)
            dashboard.getSettings().click();
        else
            System.out.println("could not reach this button please run Open_Close_Toolbar one more time");
    }

    public void logout(Dashboard dashboard) {
        if (isToolBarOpen)
            dashboard.getLogout().click();
        else
            System.out.println("could not reach this button please run Open_Close_Toolbar one more time");
    }
}
