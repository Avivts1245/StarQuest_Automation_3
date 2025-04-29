package app.netlify.star_quest.StarQuestAutomation;

import PageObjects.generalAndNavigation.Constants;
import PageObjects.generalAndNavigation.InitialDriverSetup;
import PageObjects.loginPage.OpenPageRuns;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Scanner;

public class ChromeDriverSetup {
    public static InitialDriverSetup getInitialDriverSetup() {
        WebDriver driver = new ChromeDriver();
        Constants constant = new Constants();
        Scanner input = new Scanner(System.in);
        OpenPageRuns runs = new OpenPageRuns(driver,input,constant);
        Actions actions = new Actions(driver);
        openSystem(driver, constant.getURL());
        constant.timeOut(driver, 8);
        InitialDriverSetup initialDriverSetup = new InitialDriverSetup(driver, constant, actions);
        return initialDriverSetup;
    }



    public static void openSystem(WebDriver driver, String Url) {
        driver.manage().window().maximize();
        driver.get(Url);

    }
}
