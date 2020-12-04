package world.sparc.automation.ui.pages;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public LoginPage setLogin(String s) {
        $("input[placeholder='Email']").setValue(s);
        return this;
    }

    public LoginPage setPass(String s) {
        $("input[name='password']").setValue(s);
        return this;
    }

    public MainPage confirmLogin() {
        $("input[value='Login']").click();
        return new MainPage();
    }

    //
}
