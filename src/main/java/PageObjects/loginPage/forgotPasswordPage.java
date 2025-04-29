package PageObjects.loginPage;

import PageObjects.generalAndNavigation.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class forgotPasswordPage extends WebPage {

   private final By Reset_btn = By.cssSelector("[tabindex]");
   private final By BackToLogin_btn = By.cssSelector(".MuiBox-root.css-edfgee > .MuiLink-root.MuiLink-underlineAlways.MuiTypography-body2.MuiTypography-root.css-v811nf");
   private final By Email = By.cssSelector("input#email");

    public forgotPasswordPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getResetBtn() {
        return driver.findElement(Reset_btn);
    }
    public WebElement getBackToLoginBtn() {
        return driver.findElement(BackToLogin_btn);
    }
    public WebElement getEmail() {
        return driver.findElement(Email);
    }
}
