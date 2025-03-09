package PageObjects;

import org.openqa.selenium.WebDriver;

public class Password {
    WebDriver driver;

    public Password(WebDriver driver) {
        this.driver = driver;

    }

    public static void EnterPassword(WebPage webpage, String password) {
        webpage.getPassword().sendKeys(password);
    }

    public static void RetypePassword(SignUpPage signpage, String password) {
        signpage.getRetype_Password().sendKeys(password);
    }

    public static void PasswordTests(WebPage webpage, String str) {
        EnterPassword(webpage, str);

        //workoing password As123456

    }


}
