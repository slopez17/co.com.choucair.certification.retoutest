package co.com.choucair.certification.retoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPersonalPage {

    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target SELECT_BIRTHDAY = Target.the("where do we select the birth day")
            .located(By.id("birthDay"));
    public static final Target SELECT_BIRTHMONTH= Target.the("where do we select the birth month")
            .located(By.id("birthMonth"));
    public static final Target SELECT_BIRTHYEAR = Target.the("where do we select the birth year")
            .located(By.id("birthYear"));
    public static final Target LANGUAGES = Target.the("where do we enable INPUT_LANGUAGES")
            .located(By.xpath("//div[@name='languages']"));
    public static final Target INPUT_LANGUAGES = Target.the("where do we write the languages we speak")
            .located(By.xpath("//div[@name='languages']//input"));
    public static final Target BUTTON_NEXT_STEP= Target.the("button to move on the next step")
            .located(By.xpath("//a[@aria-label='Next step - define your location']"));
}
