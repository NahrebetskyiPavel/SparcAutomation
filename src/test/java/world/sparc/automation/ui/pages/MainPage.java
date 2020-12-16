package world.sparc.automation.ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import world.sparc.automation.ui.pages.comon.Header;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.*;

public class MainPage extends Header {
    SelenideElement joinNow = $x("//button[contains(text(),'Join Now')]");
    SelenideElement logIn = $x("//a[contains(text(),'Log in')]");
    SelenideElement help = $x("");
    SelenideElement participate = $x("");
    SelenideElement host = $x("");
    SelenideElement whatIsSparc = $x("");
    SelenideElement logo = $x("");
    SelenideElement search = $x("//input[@id='__BVID__37']");

    @Step("open main page")
    public MainPage open(){
        startMaximized = true;
        Selenide.open("https://www.sparc.world");
        Selenide.executeJavaScript("window.resizeTo(1920, 1080);");
        return this;
    }
    @Step
    public Registration register(){
        joinNow.click();
        return new Registration();
    }
    @Step("open login form")
    public LoginPage openLoginForm() {
        $x("//a[contains(text(),'Log in')]").waitUntil(enabled,10);
        $x("//a[contains(text(),'Log in')]").click();
        return new LoginPage();
    }


}
