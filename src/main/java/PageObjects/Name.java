package PageObjects;

import org.openqa.selenium.WebDriver;

public class Name {

    WebDriver driver;

    public Name(WebDriver driver) {
        this.driver = driver;

    }

    public static void EnterFirst_Name(SignUpPage signpage, String name) {
        signpage.getFirst_Name().sendKeys(name);
    }

    public static void EnterLast_Name(SignUpPage signpage, String name) {
        signpage.getLast_Name().sendKeys(name);
    }


    public static void FirstNameTests(SignUpPage signpage, String str) {

        EnterFirst_Name(signpage, str);


    }

    public static void LastNameTests(SignUpPage signpage, String str) {

        EnterLast_Name(signpage, str);


    }


}
