package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import app.netlify.star_quest.StarQuestAutomation.LoginTest;

public class LoginPage extends WebPage {

    public LoginPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }
//	WebDriver driver;

//	public LoginPage(WebDriver driver) {
//		this.driver = driver;
//	}


    By LogIn_btn = By.cssSelector(".css-i2n2aa [tabindex]");
    By Remember_me_btn = By.cssSelector(".PrivateSwitchBase-input.css-1m9pwf3");
    By SignUp_btn = By.cssSelector("[class='MuiBox-root css-8e99ov']:nth-child(9) .MuiLink-underlineAlways");
    By Forgot_password = By.linkText("Forgot password?");
    By Verification = By.linkText("Verification");
    By SeePassword = By.linkText(
            ".MuiButtonBase-root.MuiIconButton-edgeEnd.MuiIconButton-root.MuiIconButton-sizeMedium.css-slyssw");


    public WebElement getLogIn_btn() {
        return driver.findElement(LogIn_btn);
    }

    public WebElement getRemember_me_btn() {
        return driver.findElement(Remember_me_btn);
    }

    public WebElement getSignUp_btn() {
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
