package world.sparc.automation.ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Registration {
    SelenideElement regWithMail = $x("//button[contains(text(),'Register with Email')]");
    SelenideElement regWith = $x("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/img[1]");
    SelenideElement regWithLinkedIn = $x("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/img[1]");
    SelenideElement regWithGoogle = $x("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/img[1]");
    SelenideElement regWithApple = $x("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/img[1]");

    @Step
    public Registration regByMail(){
        regWithMail.click();
        return this;
    }
    @Step
    public Registration setFirsName(String value){
        $x("//*[contains(@class, 'input-first-name')]").setValue(value);
        return this;
    }
    @Step
    public Registration setLastName(String s) {
        $x("//*[contains(@class, 'input-last-name')]").setValue(s);
        return this;
    }
    @Step
    public Registration setHeadLine(String s) {
        $x("//input[@id='input-headline']").setValue(s);

        return this;
    }
    @Step
    public Registration setCurrentCity(String s) {
        $x("//input[@id='autocomplete-current-city']").click();
        $x("//input[@id='autocomplete-current-city']").setValue(s);
        $x("//*[contains(text(),'"+s+"')]").click();
        return this;
    }
    @Step
    public Registration clickNext() {
        $x("//button[contains(text(),'Next')]").click();
        return this;
    }
    @Step
    public Registration setDate(String s) {
        $x("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/input[1]").setValue(s);
        return this;
    }
    @Step
    public Registration imOverTwelve(boolean b) {
        if (b)
            $x("//label[contains(text(),'Yes')]").click();
        return this;
    }
    @Step
    public Registration setMail(String string) {
        $x("//*[contains(@class, 'input-email')]").setValue(string);
        return this;
    }

    public Registration setPass(String s) {
        $x("//*[contains(@class, 'input-password')]").setValue(s);
        return this;
    }
    @Step
    public Registration confirmPass(String s) {
        $x("//*[contains(@class, 'input-confirm-password')]").setValue(s);
        return this;
    }
    @Step
    public Registration addTag(String tag) {
        $x("//span[contains(text(),'Search tags')]").click();
        Selenide.getFocusedElement().sendKeys(tag);
        $x("//*[contains(text(),'Accenture')]").click();
        return this;
    }
    @Step
    public MainPage signUp() {
        $x("//button[contains(text(),'Sign Up')]").click();
        return new MainPage();
    }
    @Step
    public Registration togleAgrementCheckBox(){
        $("p.checkbox-label").click();
        return this;
    }

}
