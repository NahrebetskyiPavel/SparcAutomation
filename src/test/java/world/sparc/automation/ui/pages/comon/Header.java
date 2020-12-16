package world.sparc.automation.ui.pages.comon;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import world.sparc.automation.ui.pages.UseMenu;

import static com.codeborne.selenide.Selenide.$x;

public class Header {

    @Step("open bugrer menu")
    public UseMenu openUserMenu(){
        $x("//*[contains(text(),'Hi, pavel')]").waitUntil(Condition.enabled,10);
        $x("//*[contains(text(),'Hi, pavel')]").click();
        return  new UseMenu();
    }
}
