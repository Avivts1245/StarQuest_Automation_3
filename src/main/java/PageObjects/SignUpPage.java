package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import app.netlify.star_quest.StarQuestAutomation.LoginTest;

public class SignUpPage extends WebPage {

    public SignUpPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }


    By First_Name = By.cssSelector("input#firstName");
    By Last_Name = By.cssSelector("input#lastName");

    By Retype_Password = By.cssSelector("input#confirmPassword");
    By SignIn_btn = By.cssSelector(".css-i2n2aa [tabindex]");
    By LogIn_btn = By.cssSelector(".MuiLink-root.MuiLink-underlineAlways.MuiTypography-body2.MuiTypography-root.css-v811nf");

    public WebDriver getDriver() {
        return driver;
    }


    public WebElement getLogIn_btn() {
        return driver.findElement(LogIn_btn);
    }

    public WebElement getFirst_Name() {
        return driver.findElement(First_Name);
    }

    public WebElement getLast_Name() {
        return driver.findElement(Last_Name);
    }

    public WebElement getRetype_Password() {
        return driver.findElement(Retype_Password);
    }

    public WebElement getSignIn_btn() {
        return driver.findElement(SignIn_btn);
    }


}
