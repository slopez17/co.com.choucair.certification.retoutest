package co.com.choucair.certification.retoutest.tasks;

import co.com.choucair.certification.retoutest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.certification.retoutest.userinterface.UtestPersonalPage.*;
import static org.openqa.selenium.Keys.ENTER;

public class CompletePersonalFields implements Task {
    private UtestData utestData;

    public CompletePersonalFields(UtestData utestData) {
        this.utestData = utestData;
    }

    public static CompletePersonalFields withYourselfData(UtestData utestData) {
        return Tasks.instrumented(CompletePersonalFields.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestData.getStrFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(utestData.getStrLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(utestData.getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(utestData.getStrBirthMonth()).from(SELECT_BIRTHMONTH),
                SelectFromOptions.byVisibleText(utestData.getStrBirthDay()).from(SELECT_BIRTHDAY),
                SelectFromOptions.byVisibleText(utestData.getStrBirthYear()).from(SELECT_BIRTHYEAR),
                Click.on(LANGUAGES),
                Enter.theValue(utestData.getStrLanguages()).into(INPUT_LANGUAGES).thenHit(ENTER),
                Click.on(BUTTON_NEXT_STEP)
        );

    }
}
