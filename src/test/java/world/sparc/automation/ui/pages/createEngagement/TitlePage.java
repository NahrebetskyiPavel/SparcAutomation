package world.sparc.automation.ui.pages.createEngagement;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import world.sparc.automation.ui.pages.Engagement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TitlePage extends Engagement {

    @Step("set tietle for engagement")
    public TitlePage setTitle(String s){
        $("input[placeholder='Engagement Title']").waitUntil(Condition.enabled,10);
        $("input[placeholder='Engagement Title']").setValue(s);
        return this;
    }
    @Step("add tag engagement")
    public TitlePage addTag(String tag) {
        $("span.multiselect__placeholder").click();
        Selenide.getFocusedElement().sendKeys(tag);
        $x("//*[contains(text(),'"+tag+"')]").click();
        return this;
    }
    @Step("next")
        public DescriptionPage clickNext(){
        $x("//button[contains(text(),'Next')]").waitUntil(Condition.enabled,5);
        $x("//button[contains(text(),'Next')]").click();
        return new DescriptionPage();
    }
}
