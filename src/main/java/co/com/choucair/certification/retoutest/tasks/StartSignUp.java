package co.com.choucair.certification.retoutest.tasks;

import co.com.choucair.certification.retoutest.userinterface.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.retoutest.userinterface.UtestHomePage.*;

public class StartSignUp implements Task {
    public static StartSignUp withRegisterForm() {
        return Tasks.instrumented(StartSignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_SIGN_UP)
        );

    }
}
