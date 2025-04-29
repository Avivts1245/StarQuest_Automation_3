package PageObjects.generalAndNavigation;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class Constants {
    public Constants() {

    }
   private final String URL = "https://starquest-dev-front-opal.vercel.app/";
   private final String mail = "shaibatonya@gmail.com";
   private final String password = "As123456";
   private final String first_Name = "Aviv";
   private final String last_Name = "Tsoref";

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

    public void timeOut(WebDriver driver, int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }
}
