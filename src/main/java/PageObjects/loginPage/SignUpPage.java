package PageObjects.loginPage;

import PageObjects.generalAndNavigation.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends WebPage {
    private final By firstName = By.cssSelector("input#firstName");
    private final By lastName = By.cssSelector("input#lastName");
    private final By retypePassword = By.cssSelector("input#confirmPassword");
    private final By signInBtn = By.cssSelector(".css-i2n2aa [tabindex]");
    private final By logInBtn = By.cssSelector(".MuiLink-root.MuiLink-underlineAlways.MuiTypography-body2.MuiTypography-root.css-v811nf");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }
    public WebElement getLogInBtn() {
        return driver.findElement(logInBtn);
    }

    public WebElement getFirstName() {
        return driver.findElement(firstName);
    }
    public WebElement getLastName() {
        return driver.findElement(lastName);
    }

    public WebElement getRetypePassword() {
        return driver.findElement(retypePassword);
    }

    public WebElement getSignInBtn() {
        return driver.findElement(signInBtn);
    }
}
