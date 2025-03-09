package PageObjects;

import org.openqa.selenium.WebDriver;

public class Email {
    WebDriver driver;

    public Email(WebDriver driver) {
        this.driver = driver;

    }

    public static void EnterMail(WebPage webpage, String mail) {
        webpage.getEmail().sendKeys(mail);
    }

    public static void MailTests(WebPage WebPage, String str) {
        EnterMail(WebPage, str);// 1 enter valid mail
//		shaibatonya6@gmail.com working mail for now
    }


}
