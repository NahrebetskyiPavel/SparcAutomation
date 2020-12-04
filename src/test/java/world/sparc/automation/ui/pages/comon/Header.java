package world.sparc.automation.ui.pages.comon;

import world.sparc.automation.ui.pages.UseMenu;

import static com.codeborne.selenide.Selenide.$x;

public class Header {
    public UseMenu openUserMenu(){
        $x("//*[contains(text(),'Hi, pavel')]").click();
        return  new UseMenu();
    }
}
