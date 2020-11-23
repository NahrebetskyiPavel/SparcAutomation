package world.sparc.automation.ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.security.Key;

import static com.codeborne.selenide.Selenide.$x;

public class Registration {
    SelenideElement regWithMail = $x("//button[contains(text(),'Register with Email')]");
    SelenideElement regWith = $x("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/img[1]");
    SelenideElement regWithLinkedIn = $x("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/img[1]");
    SelenideElement regWithGoogle = $x("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/img[1]");
    SelenideElement regWithApple = $x("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/img[1]");

    public Registration regByMail(){
        regWithMail.click();
        return this;
    }

    public Registration setFirsName(String value){
        $x("//input[@id='__BVID__64']").setValue(value);
        return this;
    }

    public Registration setLastName(String s) {
        $x("//input[@id='__BVID__66']").setValue(s);
        return this;
    }

    public Registration setHeadLine(String s) {
        $x("//input[@id='input-headline']").setValue(s);

        return this;
    }

    public Registration setCurrentCity(String s) {
        $x("//input[@id='autocomplete-current-city']").click();
        $x("//input[@id='autocomplete-current-city']").setValue(s)
        .sendKeys(Keys.ARROW_DOWN, Keys.ENTER);;
        return this;
    }

    public Registration clickNext() {
        $x("//button[contains(text(),'Next')]").click();
        return this;
    }

    public Registration setDate(String s) {
        $x("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/input[1]").setValue(s);
        return this;
    }

    public Registration imOverTwelve(boolean b) {
        if (b)
            $x("//label[contains(text(),'Yes')]").click();
        return this;
    }

    public Registration setMail(String string) {
        $x("//input[@id='__BVID__111']").setValue(string);
        return this;
    }

    public Registration setPass(String s) {
        $x("//input[@id='__BVID__113']").setValue(s);
        return this;
    }

    public Registration confirmPass(String s) {
        $x("//input[@id='__BVID__115']").setValue(s);
        return this;
    }

    public Registration addTag(String tag) {
        $x("//span[contains(text(),'Search tags')]").click();
        Selenide.getFocusedElement().sendKeys(tag);
        $x("//*[contains(text(),'Accenture')]").click();
        return this;
    }

    public MainPage signUp() {
        $x("//button[contains(text(),'SignUp')]").click();
        return new MainPage();
    }
}
