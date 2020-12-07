package world.sparc.automation.ui.pages.createEngagement;

import static com.codeborne.selenide.Selenide.*;

public class CardPage {

    public CardPage togleMakeOffer(){
        $$("label.custom-control-label").get(0).click();
        return this;
    }
    public CardPage togleMesegaHost(){
        $$("label.custom-control-label").get(1).click();
        return this;
    }

    public ReviewPage clickNext() {
        $x("//button[contains(text(),'Next')]").click();
        return new ReviewPage();
    }

    public CardPage clickBack() {
        $x("//button[contains(text(),'Back')]").click();
        return new CardPage();
    }

    public CardPage preview(){
        $x("//button[contains(text(),'Preview Engagement Card')]").click();
        return this;
    }
}
