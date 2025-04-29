package PageObjects.generalAndNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class InitialDriverSetup {
    public final WebDriver driver;
    public final Constants constant;
    public final Actions actions;

    public InitialDriverSetup(WebDriver driver, Constants constant, Actions actions) {
        this.driver = driver;
        this.constant = constant;
        this.actions = actions;
    }
}