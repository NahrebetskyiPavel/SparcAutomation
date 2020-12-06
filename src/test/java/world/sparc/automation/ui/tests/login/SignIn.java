package world.sparc.automation.ui.tests.login;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import world.sparc.automation.ui.pages.MainPage;
import world.sparc.automation.ui.tests.runner.Runner;

import static com.codeborne.selenide.Selenide.$x;

public class SignIn extends Runner {
    @Test
    public void loginTest(){
        new MainPage()
                .open()
                .openLoginForm()
                .setLogin("greencitypavel@gmail.com")
                .setPass("1234qwertTy-")
                .confirmLogin();
        $x("//*[contains(text(),'Hi, pavel')]").shouldBe(Condition.visible);
    }
}
