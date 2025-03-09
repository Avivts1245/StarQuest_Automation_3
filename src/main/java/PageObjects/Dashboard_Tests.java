package PageObjects;

import org.openqa.selenium.WebDriver;

public class Dashboard_Tests {

    WebDriver driver;
    static boolean flag;

    public Dashboard_Tests(boolean flag, WebDriver driver) {
        this.driver = driver;
        this.flag = flag;
    }

    public static void Open_Close_Toolbar(Dashboard dashboard) {
        dashboard.getToolbar().click();
        if (flag)
            flag = false;
        else
            flag = true;

    }

    public static void Go_To_Dashboard(Dashboard dashboard) {
        dashboard.getDashboardPage().click();

    }

    public static void Go_To_Reports(Dashboard dashboard) {
        dashboard.getReports().click();

    }

    public static void Go_To_Quest(Dashboard dashboard) {
        dashboard.getQuest().click();

    }

    public static void Go_To_Roadmap(Dashboard dashboard) {
        dashboard.getRoadmap().click();

    }

    public static void Go_To_AdminInvite(Dashboard dashboard) {
        dashboard.getAdminInvite().click();

    }

    public static void Go_To_Backlog(Dashboard dashboard) {
        dashboard.getBacklog().click();

    }

    public static void Go_To_MenteesOverview(Dashboard dashboard) {
        dashboard.getMenteesOverview().click();

    }

    public static void Go_To_AdminPosition(Dashboard dashboard) {
        dashboard.getAdminPosition().click();

    }

    public static void Go_To_LeaderBoard(Dashboard dashboard) {
        dashboard.getLeaderBoard().click();

    }

    public static void Go_To_Settings(Dashboard dashboard) {

        if (flag)
            dashboard.getSettings().click();
        else
            System.out.println("could not reach this button please run Open_Close_Toolbar one more time");

    }

    public static void Loagout(Dashboard dashboard) {
        if (flag)
            dashboard.getLogout().click();
        else
            System.out.println("could not reach this button please run Open_Close_Toolbar one more time");

    }

}
