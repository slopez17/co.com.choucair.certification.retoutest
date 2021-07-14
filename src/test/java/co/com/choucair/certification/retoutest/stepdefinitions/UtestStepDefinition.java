package co.com.choucair.certification.retoutest.stepdefinitions;

import co.com.choucair.certification.retoutest.model.UtestData;
import co.com.choucair.certification.retoutest.questions.Answer;
import co.com.choucair.certification.retoutest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

import static co.com.choucair.certification.retoutest.util.Constant.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepDefinition {
    @Before()
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Given("^than the user wants to sign up at utest$")
    public void thanTheUserWantsToSignUpAtUtest() {
        theActorCalled(ACTOR_NAME).wasAbleTo(
                OpenUp.thePage(),
                StartSignUp.withRegisterForm()
        );
    }


    @When("^the user enters its log information$")
    public void theUserEntersItsLogInformation(List<UtestData> utestDataList)throws Exception {
        theActorInTheSpotlight().attemptsTo(
                CompletePersonalFields.withYourselfData(utestDataList.get(ZERO)),
                CompleteLocationFields.withYourAddressData(utestDataList.get(ZERO)),
                CompleteDeviceFields.withYourDeviceData(utestDataList.get(ZERO)),
                AcceptTermsAndConditions.withYourPassword(utestDataList.get(ZERO))
                );
    }

    @Then("^the user can read$")
    public void theUserCanRead(List<UtestData> utestDataList)throws Exception {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(utestDataList.get(ZERO))));

    }
}
