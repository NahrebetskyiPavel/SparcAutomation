package world.sparc.automation.ui.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    @Step("set login")
    public LoginPage setLogin(String s) {
        $("input[placeholder='Email']").waitUntil(enabled,10);
        $("input[placeholder='Email']").setValue(s);
        return this;
    }
    @Step("set pass")
    public LoginPage setPass(String s) {
        $("input[name='password']").waitUntil(enabled,10);
        $("input[name='password']").setValue(s);
        return this;
    }
    @Step("confir login")
    public MainPage confirmLogin() {
        $("input[value='Login']").waitUntil(enabled,10);
        $("input[value='Login']").click();
        return new MainPage();
    }
    //
}
