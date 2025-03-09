package PageObjects;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Constants {
    public Constants() {

    }

    public String URL = "https://starquest-dev-front-opal.vercel.app/";


    //		https://starquest-dev-front-opal.vercel.app
    public String mail = "shaibatonya@gmail.com";
    public String password = "As123456";
    public String first_Name = "Aviv";
    public String last_Name = "Tsoref";


    public String getURL() {
        return URL;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public static void TimeOut(WebDriver driver, int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }


}
