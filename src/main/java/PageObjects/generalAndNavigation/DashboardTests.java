package PageObjects.generalAndNavigation;

import org.openqa.selenium.WebDriver;

public class DashboardTests {

    private final WebDriver driver;
    static boolean isToolBarOpen;

    public DashboardTests(boolean isToolBarOpen, WebDriver driver) {
        this.driver = driver;
        this.isToolBarOpen = isToolBarOpen;
    }

    public static void openCloseToolbar(Dashboard dashboard) {
        dashboard.getToolbar().click();
        if (isToolBarOpen)
            isToolBarOpen = false;
        else
            isToolBarOpen = true;
    }

    public static void goToDashboard(Dashboard dashboard) {
        dashboard.getDashboardPage().click();
    }

    public static void goToReports(Dashboard dashboard) {
        dashboard.getReports().click();
    }

    public static void goToQuest(Dashboard dashboard) {
        dashboard.getQuest().click();
    }

    public static void goToRoadmap(Dashboard dashboard) {
        dashboard.getRoadmap().click();
    }

    public static void goToAdminInvite(Dashboard dashboard) {
        dashboard.getAdminInvite().click();
    }

    public static void goToBacklog(Dashboard dashboard) {
        dashboard.getBacklog().click();

    }

    public static void goToMenteesOverview(Dashboard dashboard) {
        dashboard.getMenteesOverview().click();

    }

    public static void goToAdminPosition(Dashboard dashboard) {
        dashboard.getAdminPosition().click();
    }

    public static void goToLeaderBoard(Dashboard dashboard) {
        dashboard.getLeaderBoard().click();

    }

    public static void goToSettings(Dashboard dashboard) {

        if (isToolBarOpen)
            dashboard.getSettings().click();
        else
            System.out.println("could not reach this button please run Open_Close_Toolbar one more time");

    }

    public static void logout(Dashboard dashboard) {
        if (isToolBarOpen)
            dashboard.getLogout().click();
        else
            System.out.println("could not reach this button please run Open_Close_Toolbar one more time");
    }
}
