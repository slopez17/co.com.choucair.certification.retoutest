package co.com.choucair.certification.retoutest.tasks;

import co.com.choucair.certification.retoutest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.retoutest.userinterface.UtestTermsAndConditionsPage.*;


public class AcceptTermsAndConditions implements Task {
    private UtestData utestData;

    public AcceptTermsAndConditions(UtestData utestData) {
        this.utestData = utestData;
    }

    public static AcceptTermsAndConditions withYourPassword(UtestData utestData) {
        return Tasks.instrumented(AcceptTermsAndConditions.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestData.getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(utestData.getStrPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECKBOX_TERMS),
                Click.on(CHECKBOX_POLICY)
        );

    }
}
