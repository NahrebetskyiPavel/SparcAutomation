package world.sparc.automation.ui.tests.registration;
import io.qameta.allure.Description;
import org.junit.Test;
import world.sparc.automation.ui.pages.MainPage;
import world.sparc.automation.ui.pages.comon.BasePage;
import world.sparc.automation.ui.tests.runner.Runner;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;


public class RegistrationTest extends Runner {

    @Test
    @Description(" new client registration test")
    public void byMail() throws InterruptedException {
        new MainPage()
                .open()
                .register()
                .regByMail()
                .setFirsName("name")
                .setLastName("pavel")
                .setMail("greencitypavel@gmail.com".replace("@", new BasePage().getRandom() + "@"))
                .setPass("1234qwertY-")
                .confirmPass("1234qwertY-")
                .setHeadLine("MBA Student at Duke University")
                .setCurrentCity("New York")
                .togleAgrementCheckBox()
                .signUp();
        $x("//p[contains(text(),'Thank you for signing up!')]").shouldBe(visible);
    }

}
