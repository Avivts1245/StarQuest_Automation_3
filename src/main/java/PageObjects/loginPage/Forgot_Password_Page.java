package PageObjects.loginPage;

import PageObjects.generalAndNavigation.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Forgot_Password_Page extends WebPage {

   private By Reset_btn = By.cssSelector("[tabindex]");
   private By BackToLogin_btn = By.cssSelector(".MuiBox-root.css-edfgee > .MuiLink-root.MuiLink-underlineAlways.MuiTypography-body2.MuiTypography-root.css-v811nf");
   private By Email = By.cssSelector("input#email");

    public Forgot_Password_Page(WebDriver driver) {
        super(driver);
    }
    public WebElement getReset_btn() {
        return driver.findElement(Reset_btn);
    }
    public WebElement getBackToLogin_btn() {
        return driver.findElement(BackToLogin_btn);
    }
    public WebElement getEmail() {
        return driver.findElement(Email);
    }
}
