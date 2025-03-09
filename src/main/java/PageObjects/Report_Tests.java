package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Report_Tests {
    WebDriver driver;

    public Report_Tests(WebDriver driver) {
        this.driver = driver;

    }

    DaylyReportsTests DTest = new DaylyReportsTests(driver);
    Daily_Report DReport = new Daily_Report(driver);

    public static void TimeOut(WebDriver driver, int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    public void Create_and_fill_daily_report() {
//		DTest.Check_if_you_can_access(false, DReport);

        DTest.Check_if_you_can_access(false, DReport);

        TimeOut(driver, 2);

//		DTest.Fill_new_Report(DReport);


    }


}
