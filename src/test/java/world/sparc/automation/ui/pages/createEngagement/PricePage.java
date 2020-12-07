package world.sparc.automation.ui.pages.createEngagement;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

public class PricePage {
     @Getter private SelenideElement yesRadioBtn = $x("//label[contains(text(),'Yes')]");
     @Getter private SelenideElement noRadioBtn = $x("//label[contains(text(),'Yes')]");

    @Step("privacy and donation setup ")
    public PricePage  PriceAndDonations (boolean proceble){
        if (proceble) { yesRadioBtn.click(); }
        else noRadioBtn.click();
        return this;
    }
    @Step("next")
    public MediaPage clickNext() {
        $x("//button[contains(text(),'Next')]").click();
        return new MediaPage();
    }
    @Step
    public DetailsPage clickBack() {
        $x("//button[contains(text(),'Back')]").click();
        return new DetailsPage();
    }

}
