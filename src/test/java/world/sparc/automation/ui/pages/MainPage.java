package world.sparc.automation.ui.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    SelenideElement joinNow = $x("//button[contains(text(),'Join Now')]");
    SelenideElement logIn = $x("//a[contains(text(),'Log in')]");
    SelenideElement help = $x("");
    SelenideElement participate = $x("");
    SelenideElement host = $x("");
    SelenideElement whatIsSparc = $x("");
    SelenideElement logo = $x("");
    SelenideElement search = $x("//input[@id='__BVID__37']");


    public MainPage open(){
        startMaximized = true;
        Selenide.open("https://www.sparc.world");
        Selenide.executeJavaScript("window.resizeTo(1920, 1080);");
        return this;
    }

    public Registration register(){
        joinNow.click();
        return new Registration();
    }

}
