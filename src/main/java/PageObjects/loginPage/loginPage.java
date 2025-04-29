package PageObjects.loginPage;

import PageObjects.generalAndNavigation.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage extends WebPage {

   private final By LogIn_btn = By.cssSelector(".css-i2n2aa [tabindex]");
   private final By Remember_me_btn = By.cssSelector(".PrivateSwitchBase-input.css-1m9pwf3");
   private final By SignUp_btn = By.cssSelector("[class='MuiBox-root css-8e99ov']:nth-child(9) .MuiLink-underlineAlways");
   private final By Forgot_password = By.linkText("Forgot password?");
   private final By Verification = By.linkText("Verification");
   private final By SeePassword = By.linkText(
            ".MuiButtonBase-root.MuiIconButton-edgeEnd.MuiIconButton-root.MuiIconButton-sizeMedium.css-slyssw");

    public loginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogInBtn() {
        return driver.findElement(LogIn_btn);
    }

    public WebElement getRememberMeBtn() {
        return driver.findElement(Remember_me_btn);
    }

    public WebElement getSignUpBtn() {
        return driver.findElement(SignUp_btn);
    }

    public WebElement getForgot_password() {
        return driver.findElement(Forgot_password);
    }

    public WebElement getVerification() {
        return driver.findElement(Verification);
    }

    public WebElement getSeePassword() {
        return driver.findElement(SeePassword);
    }
}
