package world.sparc.automation.ui.pages.createEngagement;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import world.sparc.automation.ui.pages.comon.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage extends BasePage {

    @Getter private ElementsCollection yesM = $$x("//label[contains(text(),'Yes (Mandatory)')]");
    @Getter private ElementsCollection yesO = $$x("//label[contains(text(),'Yes (Mandatory)')]");
    @Getter private ElementsCollection no = $$x("//label[contains(text(),'Yes (Mandatory)')]");
    @Getter private SelenideElement resume = $("input[placeholder='Resume']");

    public RegistrationPage  addResume(){
        resume.setValue(getLorem().getWords(3,6));
        return this;
    }

    public RegistrationPage  addResume(String s){
        resume.setValue(s);
        return this;
    }

    public CardPage clickNext() {
        $x("//button[contains(text(),'Next')]").click();
        return new CardPage();
    }

    public MediaPage clickBack() {
        $x("//button[contains(text(),'Back')]").click();
        return new MediaPage();
    }
}
