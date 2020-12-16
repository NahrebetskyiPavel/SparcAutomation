package world.sparc.automation.ui.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import world.sparc.automation.ui.pages.createEngagement.TitlePage;

import static com.codeborne.selenide.Selenide.$x;

public class UseMenu {

        @Step("create engagement")
        public TitlePage createEngagement(){
            $x("//p[contains(text(),'Create Engagement')]").waitUntil(Condition.enabled,10);
            $x("//p[contains(text(),'Create Engagement')]").click();
            return new TitlePage();
        }
}
