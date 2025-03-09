package PageObjects;

import org.openqa.selenium.WebDriver;

public class Navigation {
    WebDriver driver;
    Dashboard dashboard;
    Dashboard_Tests dashtests;
    Constants constant;

    public Navigation(WebDriver driver, Dashboard dashboard, Dashboard_Tests dashtests, Constants constant) {
        this.dashboard = dashboard;
        this.driver = driver;
        this.dashtests = dashtests;
        this.constant = constant;
    }

    public void navigate_In_ToolBar() {
        this.constant.TimeOut(driver, 2);
        this.dashtests.Open_Close_Toolbar(dashboard);
        this.constant.TimeOut(driver, 2);
        this.constant.TimeOut(driver, 2);
        this.constant.TimeOut(driver, 2);

//		this.dashtests.Go_To_LeaderBoard(dashboard);
//		this.dashtests.Go_To_Quest(dashboard);
        this.dashtests.Go_To_Reports(dashboard);
        this.dashtests.Open_Close_Toolbar(dashboard);
//		this.dashtests.Go_To_Roadmap(dashboard);
//		this.dashtests.Go_To_Settings(dashboard);
//		this.dashtests.Loagout(dashboard);
        this.constant.TimeOut(driver, 2);
        this.constant.TimeOut(driver, 2);
//		this.dashtests.Open_Close_Toolbar(dashboard);

//		
//		this.dashtests.Go_To_AdminInvite(dashboard);
//		this.dashtests.Go_To_AdminPosition(dashboard);
//		this.constant.TimeOut(driver, 2);
//		this.dashtests.Go_To_MenteesOverview(dashboard);
//		this.constant.TimeOut(driver, 2);
//		this.dashtests.Go_To_Backlog(dashboard);
    }


}
