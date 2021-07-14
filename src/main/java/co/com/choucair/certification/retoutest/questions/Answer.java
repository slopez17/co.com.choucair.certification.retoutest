package co.com.choucair.certification.retoutest.questions;

import co.com.choucair.certification.retoutest.model.UtestData;
import co.com.choucair.certification.retoutest.userinterface.UtestTermsAndConditionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.retoutest.userinterface.UtestTermsAndConditionsPage.*;


public class Answer implements Question<Boolean> {
    private UtestData utestData;

    public Answer(UtestData utestData) {
        this.utestData = utestData;
    }

    public static Answer toThe(UtestData utestData) {
        return new Answer(utestData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String question = Text.of(TEXT_QUESTION).viewedBy(actor).asString();
        if(question.equals(utestData.getStrMessage())){
            return true;
        }
        return false;
    }
}
