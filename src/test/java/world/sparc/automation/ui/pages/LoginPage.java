package world.sparc.automation.ui.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    @Step("set login")
    public LoginPage setLogin(String s) {
        $("input[placeholder='Email']").setValue(s);
        return this;
    }
    @Step("set pass")
    public LoginPage setPass(String s) {
        $("input[name='password']").setValue(s);
        return this;
    }
    @Step("confir login")
    public MainPage confirmLogin() {
        $("input[value='Login']").click();
        return new MainPage();
    }
    //
}
