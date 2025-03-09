package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import app.netlify.star_quest.StarQuestAutomation.LoginTest;

public class Forgot_Password_Page extends WebPage {

    public Forgot_Password_Page(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }
//	WebDriver driver;

//	public LoginPage(WebDriver driver) {
//		this.driver = driver;
//	}


    By Reset_btn = By.cssSelector("[tabindex]");
    By BackToLogin_btn = By.cssSelector(".MuiBox-root.css-edfgee > .MuiLink-root.MuiLink-underlineAlways.MuiTypography-body2.MuiTypography-root.css-v811nf");
    By Email = By.cssSelector("input#email");


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
