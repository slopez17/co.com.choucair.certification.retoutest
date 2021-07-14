package co.com.choucair.certification.retoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDevicePage {
    public static final Target PC = Target.the("where do we enable INPUT_PC")
            .located(By.xpath("//div[@name='osId']"));
    public static final Target INPUT_PC = Target.the("where do we write the PC")
            .located(By.xpath("//div[@name='osId']//input"));
    public static final Target VERSION = Target.the("where do we enable INPUT_VERSION")
            .located(By.xpath("//div[@name='osVersionId']"));
    public static final Target INPUT_VERSION = Target.the("where do we write the version")
            .located(By.xpath("//div[@name='osVersionId']//input"));
    public static final Target LANGUAGE = Target.the("where do we enable INPUT_LANGUAGE")
            .located(By.xpath("//div[@name='osLanguageId']"));
    public static final Target INPUT_LANGUAGE = Target.the("where do we write the language")
            .located(By.xpath("//div[@name='osLanguageId']//input"));
    public static final Target BRAND = Target.the("where do we enable INPUT_BRAND")
            .located(By.xpath("//div[@name='handsetMakerId']"));
    public static final Target INPUT_BRAND = Target.the("where do we write the brand")
            .located(By.xpath("//div[@name='handsetMakerId']//input"));
    public static final Target MODEL = Target.the("where do we enable INPUT_MODEL")
            .located(By.xpath("//div[@name='handsetModelId']"));
    public static final Target INPUT_MODEL = Target.the("where do we write the model")
            .located(By.xpath("//div[@name='handsetModelId']//input"));
    public static final Target OS = Target.the("where do we enable INPUT_OS")
            .located(By.xpath("//div[@name='handsetOSId']"));
    public static final Target INPUT_OS = Target.the("where do we write the OS")
            .located(By.xpath("//div[@name='handsetOSId']//input"));
    public static final Target BUTTON_NEXT_STEP= Target.the("button to move on the next step")
            .located(By.xpath("//a[@aria-label='Next - final step']"));
}
