package co.com.choucair.certification.retoutest.tasks;

import co.com.choucair.certification.retoutest.model.UtestData;
import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static co.com.choucair.certification.retoutest.userinterface.UtestLocationPage.*;
import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;


public class CompleteLocationFields implements Task {
    private UtestData utestData;

    public CompleteLocationFields(UtestData utestData) {
        this.utestData = utestData;
    }

    public static CompleteLocationFields withYourAddressData(UtestData utestData) {
        return Tasks.instrumented(CompleteLocationFields.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(500);
        actor.attemptsTo(
                Enter.theValue(utestData.getStrCity()).into(INPUT_CITY),
                Hit.the(ARROW_DOWN, ENTER).into(INPUT_CITY),
                Enter.theValue(utestData.getStrZip()).into(INPUT_ZIP).thenHit(ENTER),
                Click.on(COUNTRY),
                Enter.theValue(utestData.getStrCountry()).into(INPUT_COUNTRY).thenHit(ENTER),
                Click.on(BUTTON_NEXT_STEP)
        );

    }
}
