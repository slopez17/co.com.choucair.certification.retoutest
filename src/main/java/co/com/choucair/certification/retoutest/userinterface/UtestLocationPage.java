package co.com.choucair.certification.retoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLocationPage {
    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("where do we write the zip code")
            .located(By.id("zip"));

    public static final Target COUNTRY = Target.the("where do we enable INPUT_COUNTRY")
            .located(By.xpath("//div[@name='countryId']"));
    public static final Target INPUT_COUNTRY = Target.the("where do we write the country")
            .located(By.xpath("//div[@name='countryId']//input"));
    public static final Target BUTTON_NEXT_STEP= Target.the("button to move on the next step")
            .located(By.xpath("//a[@aria-label='Next step - select your devices']"));
}
