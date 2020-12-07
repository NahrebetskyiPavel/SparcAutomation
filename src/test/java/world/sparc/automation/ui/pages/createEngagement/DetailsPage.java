package world.sparc.automation.ui.pages.createEngagement;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import world.sparc.automation.ui.pages.comon.BasePage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DetailsPage extends BasePage {

    //Engagement Types
    @Getter private SelenideElement virtual = $x("//label[contains(text(),'Virtual Engagement')]");
    @Getter private SelenideElement inPerson = $x("//label[contains(text(),'In Person Engagement')]");
    @Getter private SelenideElement both = $x("//label[contains(text(),'In Person Engagement')]");
    @Getter private SelenideElement virtualCapacity =$("#virtual-capacity");
    @Getter private SelenideElement virtualLink = $("#virtual-link");
    @Getter private SelenideElement virtualInstructions = $("#virtual-instructions");
    //Privacy setting: Public or Private?
    @Getter private SelenideElement privacyPublic = $x("//input[@id='settings-privacy']");
    @Getter private SelenideElement privacyPrivate = $x("//label[contains(text(),'Private: Your Engagement will be unsearchable and ')]");
    //Would you like to accept all guests automatically?
    @Getter private SelenideElement autoAcceptGroup = $x("//label[contains(text(),'Would you like to accept all guests automatically?')]").parent();
    @Getter private ElementsCollection acceptAutomaticallyRadioBtns = autoAcceptGroup.findAll(By.cssSelector("div.custom-radio"));
    @Getter private SelenideElement acceptAutomaticallyYes = acceptAutomaticallyRadioBtns.get(0);
    @Getter private SelenideElement acceptAutomaticallyNo = acceptAutomaticallyRadioBtns.get(1);

    @SneakyThrows
    @Step("chose privacy")
    public DetailsPage chosePrivacy(Privacy type) {
        if (type.equals(Privacy.PRIVATE)) {
            privacyPrivate.click();
        } else
            privacyPublic.click();
        return this;
    }
    @Step("next")
    public PricePage clickNext() {
        $x("//button[contains(text(),'Next')]").click();
        return new PricePage();
    }
    @Step
    public TimePage clickBack() {
        $x("//button[contains(text(),'Back')]").click();
        return new TimePage();
    }
    @Step("set capacity")
    public DetailsPage setCapacity(int count) {
        virtualCapacity.setValue(String.valueOf(count));
        return this;
    }
    @Step("add conference link")
    public DetailsPage addConferenceLink(String s) {
        virtualLink.setValue(s);
        return this;
    }
    @Step("add instriction")
    public DetailsPage addEngagementInstructions(String s) {
        virtualInstructions.setValue(s);
        return this;
    }

    public enum Privacy {PRIVATE, PUBLIC;}
}
