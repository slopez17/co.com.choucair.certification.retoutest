package co.com.choucair.certification.retoutest.tasks;

import co.com.choucair.certification.retoutest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.com.choucair.certification.retoutest.userinterface.UtestDevicePage.*;
import static org.openqa.selenium.Keys.ENTER;

public class CompleteDeviceFields implements Task {
    private UtestData utestData;

    public CompleteDeviceFields(UtestData utestData) {
        this.utestData = utestData;
    }

    public static CompleteDeviceFields withYourDeviceData(UtestData utestData) {
        return Tasks.instrumented(CompleteDeviceFields.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PC),
                Enter.theValue(utestData.getStrPC()).into(INPUT_PC).thenHit(ENTER),
                Click.on(VERSION),
                Enter.theValue(utestData.getStrVersion()).into(INPUT_VERSION).thenHit(ENTER),
                Click.on(LANGUAGE),
                Enter.theValue(utestData.getStrLanguage()).into(INPUT_LANGUAGE).thenHit(ENTER),
                Click.on(BRAND),
                Enter.theValue(utestData.getStrBrand()).into(INPUT_BRAND).thenHit(ENTER),
                Click.on(MODEL),
                Enter.theValue(utestData.getStrModel()).into(INPUT_MODEL).thenHit(ENTER),
                Click.on(OS),
                Enter.theValue(utestData.getStrOS()).into(INPUT_OS).thenHit(ENTER),
                Click.on(BUTTON_NEXT_STEP)
        );

    }
}
