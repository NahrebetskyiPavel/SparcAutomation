package world.sparc.automation.ui.pages.createEngagement;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class CardPage {
    @Step("toggle make offer")
    public CardPage togleMakeOffer(){
        $$("label.custom-control-label").get(0).click();
        return this;
    }
    @Step("toggle msg host ")
    public CardPage togleMesegaHost(){
        $$("label.custom-control-label").get(1).click();
        return this;
    }
    @Step("next")
    public ReviewPage clickNext() {
        $x("//button[contains(text(),'Next')]").click();
        return new ReviewPage();
    }
    @Step("back")
    public CardPage clickBack() {
        $x("//button[contains(text(),'Back')]").click();
        return new CardPage();
    }
    @Step("preview")
    public CardPage preview(){
        $x("//button[contains(text(),'Preview Engagement Card')]").click();
        return this;
    }
}
