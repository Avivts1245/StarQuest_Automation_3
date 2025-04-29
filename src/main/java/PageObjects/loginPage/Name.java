package PageObjects.loginPage;

import org.openqa.selenium.WebDriver;

public class Name {

    private final WebDriver driver;
    public Name(WebDriver driver) {
        this.driver = driver;
    }

    public static void enterFirstName(SignUpPage signUpPage, String name) {
        signUpPage.getFirstName().sendKeys(name);
    }

    public void enterLastName(SignUpPage signUpPage, String name) {
        signUpPage.getLastName().sendKeys(name);
    }

    public static void firstNameTests(SignUpPage signUpPage, String str) {
        enterFirstName(signUpPage, str);
    }

    public void lastNameTests(SignUpPage signUpPage, String str) {
        enterLastName(signUpPage, str);
    }
}
